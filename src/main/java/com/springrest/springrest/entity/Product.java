package com.springrest.springrest.entity;

public class Product {
    private int id;
    private String product_img;
    private String product_name;
    private String description;

    // create constructor
    public Product(int id, String product_img, String product_name, String description) {
        super();
        this.id = id;
        this.product_img = product_img;
        this.product_name = product_name;
        this.description = description;
    }

    // create default constructor
    public Product() {
        super();
    }

    // getters setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString Methods
    public String toString() {
        return "ProductDetails [id = " + id + ", product_name = " + product_name + ", description = " + description + " ]";
    }
}
