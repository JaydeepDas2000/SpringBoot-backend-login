package com.springrest.springrest.dto;

public class AuthenticationResponse {
    private String token;

    // create constructor
    public AuthenticationResponse(String token) {
        super();
        this.token = token;
    }

    // create default constructor
    public AuthenticationResponse() {
        super();
    }

    // getters setters


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    // toString Methods
    public String toString() {
        return "User [ Token: " + token +" ]";
    }
}
