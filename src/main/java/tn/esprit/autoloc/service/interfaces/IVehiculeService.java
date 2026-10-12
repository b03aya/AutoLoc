package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    public List<Vehicule> retrieveAllVehicules();
    public Vehicule retrieveVehicule(Long vehiculeId);
    public Vehicule addVehicule(Vehicule vehicule);
    public void removeVehicule(Long vehiculeId);
    public Vehicule modifyVehicule(Vehicule vehicule);
}
