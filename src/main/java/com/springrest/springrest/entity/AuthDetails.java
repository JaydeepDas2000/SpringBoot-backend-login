package com.springrest.springrest.entity;

public class AuthDetails {

    public String username;
    public String password;

    // create constructor
    public AuthDetails(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    // create default constructor
    public AuthDetails() {
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
        return "AuthDetails [username = " + username + ", password = " + password + "]";
    }
}
