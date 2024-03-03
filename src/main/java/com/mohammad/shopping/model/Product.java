package com.mohammad.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Setter
@Document(collection = "product")
public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private int quantityInStock;


}
