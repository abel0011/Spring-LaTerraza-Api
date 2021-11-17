package com.idat.laterraza.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Photo {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String name;

    private String fileName;

    private String extension;

    private String status;

    private boolean removed;

    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private MultipartFile file;

    @Transient
    private String urlFile;

    public Photo() {
        id = 0;
        name = "";
        fileName = "";
        extension = "";
        status = "A";
        removed = false;
    }


    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    public String getCompleteFileName() {
        return fileName + extension;
    }
    
}
