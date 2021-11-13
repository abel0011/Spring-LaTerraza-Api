package com.idat.laterraza.domain.exection;

public class PhotoStorageException extends RuntimeException{

    public PhotoStorageException(String message) {
        super(message);
    }

    public PhotoStorageException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
