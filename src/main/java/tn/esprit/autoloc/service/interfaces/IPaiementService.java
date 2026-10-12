package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {

    public List<Paiement> retrieveAllPaiements();
    public Paiement retrievePaiement(Long paiementId);
    public Paiement addPaiement(Paiement paiement);
    public void removePaiement(Long paiementId);
    public Paiement modifyPaiement(Paiement paiement);
}
