package com.idat.laterraza.domain.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roles")
    private Integer idRoles;

    @Column
    private String description;


    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreate;

    @Column(name = "date_updated")
    @UpdateTimestamp
    private Date dateUpdate;


    @OneToMany(mappedBy = "role", cascade = {CascadeType.ALL})
    private List<Permission> permissions;

    @OneToOne(mappedBy = "roles" )
    private Users users;


}
