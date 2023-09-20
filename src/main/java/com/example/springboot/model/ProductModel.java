package com.example.springboot.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//annotations
@Entity
@Table(name = "TB_PRODUCTS")//eng: table | pt: tabela de productos
public class ProductModel  implements Serializable{

    //atributs
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    //getters and setters of atributs

    public UUID getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    



    
}
