package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgenceService {

    public List<Agence> retrieveAllAgences();
    public Agence retrieveAgence(Long agenceId);
    public Agence addAgence(Agence agence);
    public void removeAgence(Long agenceId);
    public Agence modifyAgence(Agence agence);

}
