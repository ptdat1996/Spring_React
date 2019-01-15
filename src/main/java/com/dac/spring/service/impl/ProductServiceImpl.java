package com.dac.spring.service.impl;

import com.dac.spring.model.Product;
import com.dac.spring.repository.ProductRepository;
import com.dac.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return (List<Product>)productRepository.findAll();
    }
}
