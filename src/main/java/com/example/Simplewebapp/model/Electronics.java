package com.example.Simplewebapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Electronics extends Product {
    private String brand;

    public Electronics(int prodId, String prodName, int prodPrice, String brand) {
        super(prodId, prodName, prodPrice);
        this.brand = brand;
    }
}