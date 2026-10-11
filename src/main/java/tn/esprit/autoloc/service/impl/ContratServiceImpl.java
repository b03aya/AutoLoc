package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.repository.ContratRepository;
import tn.esprit.autoloc.service.interfaces.IContratService;

@Service
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }
}
