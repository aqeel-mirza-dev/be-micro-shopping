package com.mohammad.shopping.service;

import com.mohammad.shopping.model.Product;
import com.mohammad.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    MongoTemplate mongoTemplate;
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProductById(int productId) {
        Query query= new Query();
        query.addCriteria(Criteria.where("id").is(productId));
        return mongoTemplate.find(query,Product.class);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
