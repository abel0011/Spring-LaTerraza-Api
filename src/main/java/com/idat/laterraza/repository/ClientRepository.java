package com.idat.laterraza.repository;

import java.util.List;
import java.util.Optional;

import com.idat.laterraza.repository.crud.IClientCR;
import com.idat.laterraza.domain.entity.Client;
import com.idat.laterraza.service.contracts.IClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClientRepository implements IClient{

    @Autowired
    private IClientCR crud;

    @Override
    public List<Client> findAllClient() {
        return (List<Client>) crud.findAll();
    }

    @Override
    public Optional<Client> findById(int idClient) {
        return crud.findById(idClient);
    }

    @Override
    public Client save(Client obj) {
        return crud.save(obj);
    }

    @Override
    public void delte(int idClient) {
        crud.deleteById(idClient) ;
    }
}
