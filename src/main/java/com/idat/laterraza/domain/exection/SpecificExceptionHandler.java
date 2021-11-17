package com.idat.laterraza.domain.exection;

import com.idat.laterraza.util.Global;
import org.springframework.web.bind.annotation.RestController;

import com.idat.laterraza.util.GenericResponse;

import org.hibernate.JDBCException;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.idat.laterraza.util.Global.*;

@RestController
public class SpecificExceptionHandler {

    @ExceptionHandler(JDBCException.class)
    public GenericResponse sqlException(JDBCException ex) {
        return new GenericResponse("sql-exception", -1, Global.ERROR_OPERATION, ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public GenericResponse validException(MethodArgumentNotValidException ex) {
        return new GenericResponse("valid-exception", RESPONSE_ERROR, ERROR_OPERATION, ex.getMessage());
    }

    @ExceptionHandler(PhotoStorageException.class)
    public GenericResponse fileStorageException(PhotoStorageException ex) {
        return new GenericResponse("file-storage-exception", RESPONSE_ERROR, ERROR_OPERATION, ex.getMessage()); }
    @ExceptionHandler(MyPhotoNotFoundException.class)
    public GenericResponse myFileNotFoundException(MyPhotoNotFoundException exception) {
        return new GenericResponse("my-file-not-found-exception", RESPONSE_ERROR, ERROR_OPERATION, exception.getMessage());
    } 
}
