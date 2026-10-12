package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {
    public final IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements(){
        List<Equipement> listEquipements = equipementService.retrieveAllEquipements();
        return listEquipements;
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        Equipement equipement = equipementService.retrieveEquipement(equipementId);
        return equipement;
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement e, PushBuilder pushBuilder){
        Equipement equipement = equipementService.addEquipement(e);
        return equipement;
    }

    @DeleteMapping("/remove-equipement")
    public void removeEquipement(@RequestBody Long equipementId){
        equipementService.removeEquipement(equipementId);
    }

    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement e){
        Equipement equipement = equipementService.modifyEquipement(e);
        return equipement;
    }
}
