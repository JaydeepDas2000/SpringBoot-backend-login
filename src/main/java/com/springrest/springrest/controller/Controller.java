package com.springrest.springrest.controller;

import com.springrest.springrest.entity.AuthDetails;
import com.springrest.springrest.entity.LoginResponse;
import com.springrest.springrest.service.CheckAuthService;
import com.springrest.springrest.service.impl.AuthDetailsImpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private AuthDetailsImpleService authDetailsImpleService;

    @Autowired
    private CheckAuthService checkAuthService;

//    @GetMapping("/login")
//    public String login() {
//        return "I am login";
//    }

    //get login Auth data
    @GetMapping("/authdetails")
    public List<AuthDetails> getAuthDetails() {
        return this.authDetailsImpleService.getAllAuthDetails();
    }

    //take login auth details from UI
    @PostMapping(path = "/checkauth", consumes = "application/json")
    public List<LoginResponse> checkAuth(@RequestBody AuthDetails authDetails) {
        return this.checkAuthService.checkAuth(authDetails);
    }

}
