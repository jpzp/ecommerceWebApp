package com.application.jpzp.repository;

import com.application.jpzp.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}