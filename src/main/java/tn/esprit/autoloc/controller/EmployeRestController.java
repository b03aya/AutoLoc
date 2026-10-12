package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.interfaces.IEmployeService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {
    public final IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public List<Employe> getEmployes(){
        List<Employe> listEmployes = employeService.retrieveAllEmployes();
        return listEmployes;
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        Employe employe = employeService.retrieveEmploye(employeId);
        return employe;
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe e, PushBuilder pushBuilder){
        Employe employe = employeService.addEmploye(e);
        return employe;
    }

    @DeleteMapping("/remove-employe")
    public void removeEmploye(@RequestBody Long employeId){
        employeService.removeEmploye(employeId);
    }

    @PutMapping("/modify-employe")
    public Employe modifyEmploye(@RequestBody Employe e){
        Employe employe = employeService.modifyEmploye(e);
        return employe;
    }
}
