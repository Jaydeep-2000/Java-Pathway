package com.javacollections.collections._4_maps;

public class Product {
    private final int id;

    private final String name;

    private final int weight;

    public Product(final int id, final String name, final int weight){
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }
}
