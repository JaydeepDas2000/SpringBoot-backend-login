package com.springrest.springrest.dto;

public class AuthenticationRequest {
    private String username;
    private String password;

    // create constructor
    public AuthenticationRequest(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    // create default constructor
    public AuthenticationRequest() {
        super();
    }

    // getters setters


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString Methods
    public String toString() {
        return "User [ username = " + username + ", password = " + password + "]";
    }
}
