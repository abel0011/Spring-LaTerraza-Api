package com.idat.laterraza.repository;

import java.util.Optional;
import com.idat.laterraza.domain.entity.Photo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StoredPhotoRepository extends CrudRepository<Photo,Long>{

    @Query("SELECT da FROM Photo da WHERE da.estado = 'A' AND da.eliminado = false")
    Iterable<Photo> list();

    @Query("SELECT da FROM Photo da WHERE da.fileName = :fileName AND da.estado = 'A' AND da.eliminado = false")
    Optional<Photo> findByFileName(String fileName);
    
}
