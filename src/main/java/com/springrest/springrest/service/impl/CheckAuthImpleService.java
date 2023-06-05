package com.springrest.springrest.service.impl;

import com.springrest.springrest.entity.AuthDetails;
import com.springrest.springrest.entity.LoginResponse;

import java.util.List;

public interface CheckAuthImpleService {
    public List<LoginResponse> checkAuth(AuthDetails authDetails);
}
