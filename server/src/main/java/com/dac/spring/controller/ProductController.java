package com.dac.spring.controller;

import com.dac.spring.model.Product;
import com.dac.spring.service.ProductService;
import com.dac.spring.util.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(ResourceConstant.REQUEST_PRODUCT)
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Product> list = productService.findAll();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") int id){
        return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
    }
}
