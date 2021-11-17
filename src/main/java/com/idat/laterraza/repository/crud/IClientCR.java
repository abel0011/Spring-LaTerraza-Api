package com.idat.laterraza.repository.crud;

import org.springframework.data.repository.CrudRepository;
import com.idat.laterraza.domain.entity.Client;


public interface IClientCR extends CrudRepository<Client,Integer>{
    
}
