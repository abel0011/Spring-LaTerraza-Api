package com.idat.laterraza.domain.reponses;

import com.idat.laterraza.domain.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private String jwt;
    private Users user;

}
