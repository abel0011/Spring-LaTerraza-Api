package com.idat.laterraza.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String email;

    @Column
    private String password;

    @Column(name = "id_rol")
    private Integer idRol;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_client", nullable = false, unique = true,
    foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Key(id_client) references Client(id_client)"))
    @JsonBackReference
    private Client client;

    @OneToOne(cascade = CascadeType.ALL ,orphanRemoval = true)
    @JoinColumn(name = "id_roles", nullable = false, unique = false,
    foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Key(id_roles) references Roles(id_roles)"))
    @JsonBackReference
    private Roles roles;
    
}
