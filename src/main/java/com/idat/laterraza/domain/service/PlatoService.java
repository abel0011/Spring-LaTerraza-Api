package com.idat.laterraza.domain.service;

import javax.transaction.Transactional;

import com.idat.laterraza.domain.util.GenericResponse;
import com.idat.laterraza.persistence.crud.PlatoRepository;

import org.springframework.stereotype.Service;

import static com.idat.laterraza.domain.util.Global.*;

@Service
@Transactional
public class PlatoService {

    private final PlatoRepository repository;

    public PlatoService(PlatoRepository repository) {
        this.repository = repository;
    }

    public GenericResponse listarPlatillosRecomendados(){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarPlatillosRecomendados());
    }

    public GenericResponse listarPlatillosPorCategoria(int idC){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarPlatillosPorCategoria(idC));
    }
    
}
