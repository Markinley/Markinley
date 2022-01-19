package com.bar.cms.api;

import com.bar.cms.model.Client;
import com.bar.cms.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping(value = ("/client"))
public class ClientRessource
{
    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @GetMapping
    public List<Client> clientList(){
        return clientService.clientList();
    }

    @GetMapping(value = ("/{clientId}"))
    public Client clientSearch(@PathVariable("clientId") int clientId){
        return clientService.searchClient(clientId);
    }

    @PutMapping(value = ("/{clientId}"))
    public Client updateClient(@PathVariable("clientId") int clientId,@RequestBody Client client){
        return clientService.updateClient(clientId,client);
    }

    @DeleteMapping(value = "/{clientId}")
    public void deleteClient(@PathVariable("clientId") int clientId){
        clientService.deleteClient(clientId);
    }
}
