package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;
import tn.esprit.autoloc.service.interfaces.IContratService;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    public List<Contrat> retrieveAllContrats(){
        return contratRepository.findAll();
    }

    public Contrat retrieveContrat(Long contratId){
        return contratRepository.findById(contratId).get();
    }

    public Contrat addContrat(Contrat contrat){
        return contratRepository.save(contrat);
    }

    public void removeContrat(Long contratId){
        contratRepository.deleteById(contratId);
    }

    public Contrat modifyContrat(Contrat contrat){
        return contratRepository.save(contrat);
    }
}
