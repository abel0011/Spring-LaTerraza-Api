package com.idat.laterraza.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "Categoria")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categoria {
   /* 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre",length = 100)
    private String nombre;

    @Column(name = "vigencia")
    private boolean vigencia;

    @OneToOne
    private DocumentoAlmacenado foto;
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String nombre;
    @Column
    private boolean vigencia;
    @OneToOne
    private DocumentoAlmacenado foto;
    
}
