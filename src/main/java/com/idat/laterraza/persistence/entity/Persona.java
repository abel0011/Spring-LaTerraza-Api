package com.idat.laterraza.persistence.entity;

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
@Table(name = "Persona")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column(name ="dni", nullable = true, length = 8)
    private String dni;
    
    @Column(name ="priNombre", nullable = true, length = 50)
    private String priNombre;

    @Column(name ="seguNombre", nullable = true, length = 50)
    private String seguNombre;

    @Column(name ="priApellido", nullable = true, length = 50)
    private String priApellido;

    @Column(name ="numTelefono", nullable = true, length = 9)
    private String numTelefono;

    @Column(name ="genero", nullable = true, length = 1)
    private String genero;
    
}   
   