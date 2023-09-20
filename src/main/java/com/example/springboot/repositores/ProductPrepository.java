package com.example.springboot.repositores;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.ProductModel;

public interface ProductPrepository extends JpaRepository<ProductModel, UUID> {
    
}
