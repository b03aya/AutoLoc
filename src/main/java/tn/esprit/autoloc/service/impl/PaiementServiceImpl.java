package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.repository.PaiementRepository;
import tn.esprit.autoloc.service.interfaces.IPaiementService;

@Service
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }
}
