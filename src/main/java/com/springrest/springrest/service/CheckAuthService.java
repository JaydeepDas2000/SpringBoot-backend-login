package com.springrest.springrest.service;

import com.springrest.springrest.entity.AuthDetails;
import com.springrest.springrest.entity.LoginResponse;
import com.springrest.springrest.service.impl.CheckAuthImpleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CheckAuthService implements CheckAuthImpleService {

    @Value("${username1}")
    private String user1;

    @Value("${password1}")
    private String pass1;

    @Value("${username2}")
    private String user2;

    @Value("${password2}")
    private String pass2;


    List<LoginResponse> loginResponses;

    public CheckAuthService() {
        loginResponses = new ArrayList<>();
    }

    @Override
    public List<LoginResponse> checkAuth(AuthDetails authDetails) {
        if(loginResponses.size()==0) {
            if((Objects.equals(authDetails.username, "admin") && Objects.equals(authDetails.password, "sysadmin")) || (Objects.equals(authDetails.username, "jaydeep") && Objects.equals(authDetails.password, "123"))) {
                loginResponses.add(new LoginResponse("Successful Login"));
            } else {
                loginResponses.add(new LoginResponse("Wrong username or password"));
            }
        } else {
            if((Objects.equals(authDetails.username, "admin") && Objects.equals(authDetails.password, "sysadmin")) || (Objects.equals(authDetails.username, "jaydeep") && Objects.equals(authDetails.password, "123"))) {
                loginResponses.set(0, new LoginResponse("Successful Login"));
            } else {
                loginResponses.set(0, new LoginResponse("Wrong username or password"));
            }
        }

        return loginResponses;
    }
}
