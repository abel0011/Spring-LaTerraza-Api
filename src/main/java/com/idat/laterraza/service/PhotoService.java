package com.idat.laterraza.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

import com.idat.laterraza.domain.entity.Photo;
import com.idat.laterraza.repository.StoredPhotoRepository;
import com.idat.laterraza.util.GenericResponse;

import java.io.IOException;
import java.util.HashMap;

import static com.idat.laterraza.util.Global.*;


@Service
@Transactional
public class PhotoService {

    @Autowired
    private StoredPhotoRepository repository;

    @Autowired
    private PhotoStorageService storageService;


    public GenericResponse<Iterable<Photo>> list() {
        return new GenericResponse<Iterable<Photo>>(TYPE_RESULT, RESPONSE_OK, CORRECT_OPERATION, repository.list());
    }



    public GenericResponse save(Photo obj) {

        String fileName = (repository.findById(obj.getId())).orElse(new Photo()).getFileName();

        String originalFilename = obj.getFile().getOriginalFilename();
        String extension = originalFilename.substring(originalFilename.lastIndexOf("."));

        fileName = storageService.storeFile(obj.getFile(), fileName);

        obj.setFileName(fileName);
        obj.setExtension(extension);

        return new GenericResponse(TYPE_DATA, RESPONSE_OK, CORRECT_OPERATION, repository.save(obj));
    }

    public ResponseEntity<Resource> download(String completefileName, HttpServletRequest request) {

        Resource resource = storageService.loadResource(completefileName);
        String contentType = null;

        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

    public ResponseEntity<Resource> downloadByFileName(String fileName, HttpServletRequest request) {
        Photo photo = repository.findByFileName(fileName).orElse(new Photo());
        return download(photo.getCompleteFileName(), request);
    }


    public GenericResponse delete(Long aLong) {
        return null;
    }

    public HashMap<String, Object> validate(Photo obj) {
        return null;
    }
    
}
