package com.idat.laterraza.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GenericResponse<T> {

    private String type;
    private int response;
    private String message;
    private T body;

    public GenericResponse() {
        type = "";
        response = 0; // 1 successful, -1 error
        message = "";
        body = null;
    }

    public GenericResponse(String bodyType, Object body) {
        type = "";
        response = 0;
        message = "";
        this.body = null;
    }

}
