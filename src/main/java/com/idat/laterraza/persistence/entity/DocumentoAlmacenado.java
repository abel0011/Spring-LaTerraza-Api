package com.idat.laterraza.persistence.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;
import javax.persistence.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "DocumentoAlmacenado")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DocumentoAlmacenado {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = true, length = 150)
    private String nombre;

    @Column(name = "filename", nullable = true, length = 250)
    private String filename;

    @Column(name = "extension", nullable = true )
    private String extension;

    @Column(name = "estado", nullable = true  )
    private String estado;

    @Column(name = "eliminado", nullable = true )
    private boolean eliminado;

    
    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private MultipartFile file;

    @Transient
    private String urlFile;

    */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String fileName;

    private String extension;

    private String estado;

    private boolean eliminado;

    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private MultipartFile file;

    @Transient
    private String urlFile;
}
