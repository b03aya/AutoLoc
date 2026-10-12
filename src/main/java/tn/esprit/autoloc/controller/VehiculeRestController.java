package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.interfaces.IVehiculeService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {
    public final IVehiculeService vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules(){
        List<Vehicule> listVehicules = vehiculeService.retrieveAllVehicules();
        return listVehicules;
    }

    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        Vehicule vehicule = vehiculeService.retrieveVehicule(vehiculeId);
        return vehicule;
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v, PushBuilder pushBuilder){
        Vehicule vehicule = vehiculeService.addVehicule(v);
        return vehicule;
    }

    @DeleteMapping("/remove-vehicule")
    public void removeVehicule(@RequestBody Long vehiculeId){
        vehiculeService.removeVehicule(vehiculeId);
    }

    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule v){
        Vehicule vehicule = vehiculeService.modifyVehicule(v);
        return vehicule;
    }
}
