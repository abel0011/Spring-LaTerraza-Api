package com.idat.laterraza.domain.crud;

import com.idat.laterraza.persistence.entity.Plato;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PlatoRepository extends CrudRepository<Plato,Integer>{

    @Query("SELECT * FROM Plato  ")
    Iterable<Plato> listarPlatillosRecomendados();

    @Query("SELECT P FROM Plato P WHERE P.categoria.id=:idC")
    Iterable<Plato> listarPlatillosPorCategoria(int idC);

    @Modifying
    @Query("UPDATE Plato P SET P.stock=stock-:cant WHERE P.id=:id")
    void descontarStock(int cant, int id);

    @Modifying
    @Query("UPDATE Platillo P SET P.stock=stock+:cant WHERE P.id=:id")
    void aumentarStock(int cant, int id);
    
}

