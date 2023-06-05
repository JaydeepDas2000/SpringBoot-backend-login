package com.springrest.springrest.service;

import com.springrest.springrest.entity.AuthDetails;
import com.springrest.springrest.service.impl.AuthDetailsImpleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthDetailsService implements AuthDetailsImpleService {

    // constant user value taken from application.properties file
    @Value("${username1}")
    private String user1;

    @Value("${password1}")
    private String pass1;

    @Value("${username2}")
    private String user2;

    @Value("${password2}")
    private String pass2;


    List<AuthDetails> userList;

    public AuthDetailsService() {
        userList = new ArrayList<>();
        userList.add(new AuthDetails("admin", "sysadmin"));
        userList.add(new AuthDetails("jaydeep", "123"));
    }

    @Override
    public List<AuthDetails> getAllAuthDetails() {
        return userList;
    }

}
