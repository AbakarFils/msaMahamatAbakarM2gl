package com.commerce.microcommerce.web.controller;

import com.commerce.microcommerce.dao.ProductDao;
import com.commerce.microcommerce.dao.ProductDaoImpl;
import com.commerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Classe: M2GL
 * Ecole: ISI
 * Prenom :Mahamat Abakar
 */
@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;


    //Récupérer la liste des produits
    @RequestMapping(value = "/Produits", method = RequestMethod.GET)
    public List<Product> listeProduits() {
        return productDao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }
}
