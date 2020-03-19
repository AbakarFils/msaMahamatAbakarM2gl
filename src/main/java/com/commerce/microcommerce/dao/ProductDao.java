package com.commerce.microcommerce.dao;

import com.commerce.microcommerce.model.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);
}
