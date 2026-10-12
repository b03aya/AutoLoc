package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.interfaces.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {
    public final IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances(){
        List<Maintenance> listMaintenances = maintenanceService.retrieveAllMaintenances();
        return listMaintenances;
    }

    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        Maintenance maintenance = maintenanceService.retrieveMaintenance(maintenanceId);
        return maintenance;
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m, PushBuilder pushBuilder){
        Maintenance maintenance = maintenanceService.addMaintenance(m);
        return maintenance;
    }

    @DeleteMapping("/remove-maintenance")
    public void removeMaintenance(@RequestBody Long maintenanceId){
        maintenanceService.removeMaintenance(maintenanceId);
    }

    @PutMapping("/modify-maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance m){
        Maintenance maintenance = maintenanceService.modifyMaintenance(m);
        return maintenance;
    }
}
