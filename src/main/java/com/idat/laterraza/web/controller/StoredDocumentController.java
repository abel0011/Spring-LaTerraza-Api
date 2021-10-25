package com.idat.laterraza.web.controller;


import javax.servlet.http.HttpServletRequest;

import com.idat.laterraza.domain.entity.StoredDocument;
import com.idat.laterraza.service.StoredDocumentService;
import com.idat.laterraza.util.GenericResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class StoredDocumentController {

    @Autowired
    private StoredDocumentService service;


    @GetMapping
    public GenericResponse list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GenericResponse find(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/download/{fileName}")
    public ResponseEntity<Resource> download(@PathVariable String fileName, HttpServletRequest request) {
        return service.downloadByFileName(fileName, request);
    }

    @PostMapping
    public GenericResponse save(@ModelAttribute StoredDocument obj) {
        return service.save(obj);
    }

    public GenericResponse update(Long aLong, StoredDocument obj) {
        return null;
    }
    
    public GenericResponse delete(Long aLong) {
        return null;
    }
    
}
