package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {
    public final IClientService clientService;

    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients(){
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
    }

    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        Client client = clientService.retrieveClient(clientId);
        return client;
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c, PushBuilder pushBuilder){
        Client client = clientService.addClient(c);
        return client;
    }

    @DeleteMapping("/remove-client")
    public void removeClient(@RequestBody Long clientId){
        clientService.removeClient(clientId);
    }

    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client c){
        Client client = clientService.modifyClient(c);
        return client;
    }
}
