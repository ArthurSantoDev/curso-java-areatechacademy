package com.arthurdev.crud.repositories;

import com.arthurdev.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
