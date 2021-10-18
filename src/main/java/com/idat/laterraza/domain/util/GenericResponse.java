package com.idat.laterraza.domain.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericResponse<T> {
    
    private String type;
    private int rpta;
    private String message;
    private T body;
}
