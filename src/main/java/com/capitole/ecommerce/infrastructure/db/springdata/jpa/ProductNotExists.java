package com.capitole.ecommerce.infrastructure.db.springdata.jpa;

public class ProductNotExists extends RuntimeException{
    public ProductNotExists() {
        super("No encontrado precio");
    }
}
