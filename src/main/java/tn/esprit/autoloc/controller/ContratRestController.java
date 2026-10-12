package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.interfaces.IContratService;


import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {
    public final IContratService contratService;

    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats(){
        List<Contrat> listContrats = contratService.retrieveAllContrats();
        return listContrats;
    }

    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        Contrat contrat = contratService.retrieveContrat(contratId);
        return contrat;
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat c, PushBuilder pushBuilder){
        Contrat contrat = contratService.addContrat(c);
        return contrat;
    }

    @DeleteMapping("/remove-contrat")
    public void removeContrat(@RequestBody Long contratId){
        contratService.removeContrat(contratId);
    }

    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat c){
        Contrat contrat = contratService.modifyContrat(c);
        return contrat;
    }
}
