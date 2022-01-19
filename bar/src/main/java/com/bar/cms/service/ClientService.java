package com.bar.cms.service;

import com.bar.cms.dao.ClientDAO;
import com.bar.cms.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {

    @Autowired
    private ClientDAO clientDAO;

    // Add Client
    public Client addClient(Client client){
        return clientDAO.save(client);
    }

    // List Client
    public List<Client> clientList(){
        return clientDAO.findAll();
    }

    //Search Client
    public Client searchClient(int clientId){
        return clientDAO.findById(clientId).get();
    }
    //Update Client
    public Client updateClient(int clientId, Client client){
        client.setClientId(clientId);
        return clientDAO.save(client);
    }

    //delete Client
    public void deleteClient(int clientId){
        clientDAO.deleteById(clientId);
    }
}
