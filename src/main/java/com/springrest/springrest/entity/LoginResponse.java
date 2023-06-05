package com.springrest.springrest.entity;

public class LoginResponse {
    public String loginResponse;

    public LoginResponse(String loginResponse) {
        super();
        this.loginResponse = loginResponse;
    }

    public LoginResponse() {
        super();
    }

    public String getLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(String loginResponse) {
        this.loginResponse = loginResponse;
    }

    public String toString() {
        return "LoginResponse [loginResponse = " + loginResponse + "]";
    }
}
