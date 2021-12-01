package com.idat.laterraza.web.security;

import java.util.ArrayList;

import com.idat.laterraza.domain.entity.Users;
import com.idat.laterraza.repository.crud.IUserCR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.User;

//Sobreescribir Metodo Registro Usuario
@Service("userDetailsService")
public class UserDetailsCustomService implements UserDetailsService {

    @Autowired
    private IUserCR crud;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // si encuentra un resultado devuelve el cliente si no null
        Users findUser = crud.findByEmail(username).map(user -> {
            return user;
        }).orElse(null);

        if (findUser == null) {
            throw new UsernameNotFoundException(username);
        }
        /* creo array de roles */
        var roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority("PADMIN"));

        return new User(findUser.getEmail(), "{bcrypt}" + findUser.getPassword(), roles);
    }
}



