package com.example.Simplewebapp.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Electronics.class, name = "electronics"),
        @JsonSubTypes.Type(value = Clothing.class, name = "clothing")
})
public abstract class Product {
    private int prodId;
    private String prodName;
    private int prodPrice;
}