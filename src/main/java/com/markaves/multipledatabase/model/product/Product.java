package com.markaves.multipledatabase.model.product;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(schema = "products")
public class Product {
    @Id
    private int id;

    private String name;

    private double price;
}
