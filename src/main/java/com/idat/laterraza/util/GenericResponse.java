package com.idat.laterraza.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class GenericResponse<T> {

    private String type;
    private int rpta;
    private String message;
    private T body;

    public GenericResponse() {
        type = "";
        rpta = 0;
        message = "";
        body = null;
    }

    public GenericResponse(String bodyType, Object body) {
        type = "";
        rpta = 0;
        message = "";
        this.body = null;
    }

}
