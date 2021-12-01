package com.idat.laterraza.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {
       public static void main(String[] args) {
        var password = "12345";
        System.out.println("password: " + password);
        System.out.println("password: " + encrypt(password));
    }

    public static String encrypt(String password) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
