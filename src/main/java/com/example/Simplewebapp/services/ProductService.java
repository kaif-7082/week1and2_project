package com.example.Simplewebapp.services;

import com.example.Simplewebapp.model.Clothing;
import com.example.Simplewebapp.model.Electronics;
import com.example.Simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService implements ProductOperations {

    Map<Integer, Product> productsMap;

    public ProductService() {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Electronics(101, "iphone", 50000, "Apple"),
                new Clothing(102, "T-Shirt", 1500, "M")
        ));
        productsMap = products.stream()
                .collect(Collectors.toMap(Product::getProdId, product -> product));
    }

    public List<Product> getProducts() {
        return new ArrayList<>(productsMap.values());
    }

    public Product getProductById(int prodId) {
        if (!productsMap.containsKey(prodId)) {
            throw new ProductNotFoundException("Product with id " + prodId + " not found");
        }
        return productsMap.get(prodId);
    }

    public void addProduct(Product prod) {
        productsMap.put(prod.getProdId(), prod);
    }

    public String checkProductAvailability(int prodId) {
        Product product = getProductById(prodId);
        if (product.getProdPrice() > 0) {
            return "Product is available!";
        } else {
            return "Product is out of stock.";
        }
    }
}