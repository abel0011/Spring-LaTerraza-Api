package com.idat.laterraza.repository.crud;

import java.util.List;
import java.util.Optional;

import com.idat.laterraza.domain.entity.Users;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUserCR extends CrudRepository<Users, Integer> {

    // Optional<Users> findByUsername(String username);

    // List<Users> findByIdRol(Integer idRol);

    // @Query(value = "SELECT * FROM users WHERE id_rol != 1 and id_rol!=5", nativeQuery = true)
    @Query(value = "SELECT * FROM `users` WHERE id_rol != 1", nativeQuery = true)
    List<Users> getEmployesAll();

     Optional<Users> findByEmail(String email);
}
