package com.idat.laterraza.web.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.idat.laterraza.domain.entity.Photo;
import com.idat.laterraza.service.PhotoService;
import com.idat.laterraza.util.GenericResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class StoredPhotoController {

    @Autowired
    private PhotoService service;
    
    Logger logger = LoggerFactory.getLogger(StoredPhotoController.class);

    @GetMapping
    public ResponseEntity<GenericResponse> list() {
        GenericResponse<Iterable<Photo>> listStoredDocument =  service.list();
        logger.info("Inofrmacion Esto es informacion ==>"+listStoredDocument.getBody());
        ArrayList<Photo> storedDocumentList = (ArrayList<Photo>) listStoredDocument.getBody();

        if(storedDocumentList.size() == 0 ){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

       return new ResponseEntity<>(listStoredDocument, HttpStatus.OK);
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
    public GenericResponse save(@ModelAttribute Photo obj) {
        return service.save(obj);
    }

    public GenericResponse update(Long aLong, Photo obj) {
        return null;
    }
    
    public GenericResponse delete(Long aLong) {
        return null;
    }
    
}
