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
@Table(name = "Plato")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlato;
        
    @Column(name = "plato", nullable = true, length = 100)
    private String nombre;

    @Column(name = "precio", nullable = true, length = 100)
    private double precio;

    @Column(name = "imagen", nullable = true, length = 100)
    private String imagen;
}
