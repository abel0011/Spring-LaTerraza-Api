package com.idat.laterraza.service.contracts;

import java.util.List;
import java.util.Optional;

import com.idat.laterraza.domain.entity.Client;

public interface IClient {

    List<Client> findAllClient();    

    Optional<Client> findById (int idClient);

    Client save(Client obj);

    void delte(int idClient);
}
