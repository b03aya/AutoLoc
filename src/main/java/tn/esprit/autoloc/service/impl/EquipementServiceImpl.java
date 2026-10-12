package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.List;

@Service
@AllArgsConstructor

public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    public List<Equipement> retrieveAllEquipements(){
        return equipementRepository.findAll();
    }

    public Equipement retrieveEquipement(Long equipementId){
        return equipementRepository.findById(equipementId).get();
    }

    public Equipement addEquipement(Equipement equipement){
        return equipementRepository.save(equipement);
    }

    public void removeEquipement(Long equipementId){
        equipementRepository.deleteById(equipementId);
    }

    public Equipement modifyEquipement(Equipement equipement){
        return equipementRepository.save(equipement);
    }
}
