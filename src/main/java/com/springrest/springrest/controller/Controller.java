package com.springrest.springrest.controller;

import com.springrest.springrest.entity.AuthDetails;
import com.springrest.springrest.entity.LoginResponse;
import com.springrest.springrest.entity.Product;
import com.springrest.springrest.service.CheckAuthService;
import com.springrest.springrest.service.impl.AuthDetailsImpleService;
import com.springrest.springrest.service.impl.ProductImpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private AuthDetailsImpleService authDetailsImpleService;

    @Autowired
    private CheckAuthService checkAuthService;

    @Autowired
    private ProductImpleService productImpleService;


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

    // collect JSON data from resource and send to frontend
    @GetMapping(path = "/products_data", produces = MediaType.APPLICATION_JSON_VALUE)
    public String productList() throws IOException {
        ClassPathResource resource = new ClassPathResource("product.json");
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = StreamUtils.copyToByteArray(inputStream);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @GetMapping("/products_data/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable int productId) {
        Product product = productImpleService.getProductById(productId);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
