package com.dac.spring.service;

import com.dac.spring.model.Product;

import java.util.List;

public interface ProductService{
    List<Product> findAll();
}