package com.example.springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.ProductRecordDtos;
import com.example.springboot.model.ProductModel;
import com.example.springboot.repositores.ProductPrepository;

import jakarta.validation.Valid;

@RestController
public class productController {
    
    @Autowired
    ProductPrepository productPrepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDtos productRecordDto) {
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecordDto, productModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(productPrepository.save(productModel));
    }



}
