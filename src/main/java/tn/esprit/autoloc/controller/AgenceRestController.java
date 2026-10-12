package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {
    public final IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences(){
        List<Agence> listAgences = agenceService.retrieveAllAgences();
        return listAgences;
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveProjet(@PathVariable("agence-id") Long projetId) {
        Agence agence = agenceService.retrieveAgence(projetId);
        return agence;
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence a, PushBuilder pushBuilder){
        Agence agence = agenceService.addAgence(a);
        return agence;
    }

    @DeleteMapping("/remove-agence")
    public void removeAgence(@RequestBody Long agenceId){
        agenceService.removeAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence a){
        Agence agence = agenceService.modifyAgence(a);
        return agence;
    }

}
