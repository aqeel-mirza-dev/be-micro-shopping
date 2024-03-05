package com.mohammad.shopping.controller;

import com.mohammad.shopping.model.Product;
import com.mohammad.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path="productservice")
public class ProductController {

    // method names will be verb-noun structure
    // end point will be noun-verb structure
    @Autowired
    private ProductService productService;

    @GetMapping(value="/welcome")
    public String welcome(){
        return "welcome to landing page with Spring security";
    }

    @PostMapping(value="/products/create")
    public Product createProduct(@RequestBody Product product){
      return productService.createProduct(product);
    }

    @GetMapping(value = "/products/getById")
    public List<Product> getProductById(@RequestParam(value = "productId") int productId){
        return productService.getProductById(productId);
    }

    @GetMapping(value = "/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping(value="/products/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @GetMapping(value = "/products/delete")
    public void deleteProduct(@RequestParam(value = "productId") int productId){

    }
    @GetMapping(value = "/products/search")
    public void searchProducts(){

    }
}
