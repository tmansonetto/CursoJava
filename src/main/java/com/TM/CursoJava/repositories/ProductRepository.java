package com.TM.CursoJava.repositories;

import com.TM.CursoJava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
