package com.idat.laterraza.service;

import java.util.List;
import java.util.Optional;

import com.idat.laterraza.domain.entity.Client;
import com.idat.laterraza.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService  {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAllClient(){
        return repository.findAllClient();
    }

    public Optional<Client> findById(int idClient){
        return repository.findById(idClient);
    }

    public Client save(Client client){
        return repository.save(client);
    }

    public Boolean delete(int idClient){

        return this.findById(idClient).map(driver ->{

                repository.delte(idClient);
                return true;

        }).orElse(false);
    }
    
}
