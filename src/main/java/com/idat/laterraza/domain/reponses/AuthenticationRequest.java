package com.idat.laterraza.domain.reponses;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
    
}
