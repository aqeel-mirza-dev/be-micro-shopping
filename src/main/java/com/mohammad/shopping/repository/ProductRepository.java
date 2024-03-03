package com.mohammad.shopping.repository;

import com.mohammad.shopping.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,Integer> {
}
