package com.idat.laterraza.repository;

import java.util.Optional;
import com.idat.laterraza.domain.entity.StoredDocument;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StoredDocumentRepository extends CrudRepository<StoredDocument,Long>{

    @Query("SELECT da FROM StoredDocument da WHERE da.estado = 'A' AND da.eliminado = false")
    Iterable<StoredDocument> list();

    @Query("SELECT da FROM StoredDocument da WHERE da.fileName = :fileName AND da.estado = 'A' AND da.eliminado = false")
    Optional<StoredDocument> findByFileName(String fileName);
    
}
