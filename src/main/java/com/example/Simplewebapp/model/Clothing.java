package com.example.Simplewebapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Clothing extends Product {
    private String size;

    public Clothing(int prodId, String prodName, int prodPrice, String size) {
        super(prodId, prodName, prodPrice);
        this.size = size;
    }
}