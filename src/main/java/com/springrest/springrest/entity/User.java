package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    // create constructor
    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    // create default constructor
    public User() {
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
        return "User [ id = " + id + ", username = " + username + ", password = " + password + "]";
    }
}
