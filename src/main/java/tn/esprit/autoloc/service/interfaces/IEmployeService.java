package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {

    public List<Employe> retrieveAllEmployes();
    public Employe retrieveEmploye(Long employeId);
    public Employe addEmploye(Employe employe);
    public void removeEmploye(Long employeId);
    public Employe modifyEmploye(Employe employe);
}
