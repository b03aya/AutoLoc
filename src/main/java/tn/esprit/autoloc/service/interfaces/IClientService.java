package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {

    public List<Client> retrieveAllClients();
    public Client retrieveClient(Long clientId);
    public Client addClient(Client client);
    public void removeClient(Long clientId);
    public Client modifyClient(Client client);

}
