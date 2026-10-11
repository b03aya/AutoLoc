package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.Client;  //UAwmp xampp

public interface ClientRepository extends JpaRepository<Client,Long> {
}
