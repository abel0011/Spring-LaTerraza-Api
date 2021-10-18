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
@Table(name = "Plato")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre",length = 100)
    private String nombre;

    @OneToOne
    private DocumentoAlmacenado foto;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "stock")
    private int stock;

    @Column(name = "descripcion",length = 500)
    private String descripcion;

    @OneToOne
    private Categoria categoria;

    @Column
    private boolean vigencia;

}
