package org.example.javaassignment3.repository;

import org.example.javaassignment3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
