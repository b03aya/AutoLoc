package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.interfaces.IPaiementService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {
    public final IPaiementService paiementService;

    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements(){
        List<Paiement> listPaiements = paiementService.retrieveAllPaiements();
        return listPaiements;
    }

    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        Paiement paiement = paiementService.retrievePaiement(paiementId);
        return paiement;
    }

    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement p, PushBuilder pushBuilder){
        Paiement paiement = paiementService.addPaiement(p);
        return paiement;
    }

    @DeleteMapping("/remove-paiement")
    public void removePaiement(@RequestBody Long paiementId){
        paiementService.removePaiement(paiementId);
    }

    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement p){
        Paiement paiement = paiementService.modifyPaiement(p);
        return paiement;
    }
}
