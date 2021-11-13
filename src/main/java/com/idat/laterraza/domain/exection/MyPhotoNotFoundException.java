package com.idat.laterraza.domain.exection;

public class MyPhotoNotFoundException extends RuntimeException{

    public MyPhotoNotFoundException(String message) {
        super(message);
    }

    public MyPhotoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
