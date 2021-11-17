package com.idat.laterraza.web.controller;

import java.util.List;

import com.idat.laterraza.domain.entity.Client;
import com.idat.laterraza.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/list")
    public ResponseEntity<List<Client>> listClient (){

        return new ResponseEntity<>(clientService.findAllClient(),HttpStatus.OK);
    }
}
