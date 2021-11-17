package com.idat.laterraza.repository;

import java.util.Optional;
import com.idat.laterraza.domain.entity.Photo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StoredPhotoRepository extends CrudRepository<Photo,Long>{

    @Query("SELECT po FROM Photo po WHERE po.status = 'A' AND po.removed = false")
    Iterable<Photo> list();

    @Query("SELECT po FROM Photo po WHERE po.fileName = :fileName AND po.status = 'A' AND po.removed = false")
    Optional<Photo> findByFileName(String fileName);
    
}
