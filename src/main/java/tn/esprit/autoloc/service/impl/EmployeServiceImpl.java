package tn.esprit.autoloc.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.repository.EmployeRepository;
import tn.esprit.autoloc.service.interfaces.IEmployeService;

@Service
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }
}
