package com.TM.CursoJava.services;

import com.TM.CursoJava.entities.Product;
import com.TM.CursoJava.repositories.CategoryRepository;
import com.TM.CursoJava.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product findById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

}
