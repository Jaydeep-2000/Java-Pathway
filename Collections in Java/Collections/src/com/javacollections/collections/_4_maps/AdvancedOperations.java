package com.javacollections.collections._4_maps;

import java.util.HashMap;

public class AdvancedOperations {
    public static void main(String[] args) {
        var defaultProduct = new Product(
                -1,"Whatever customer wants", 100
        );

        var idToProduct = new HashMap<Integer, Product>();

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println(idToProduct.getOrDefault(10, defaultProduct));
        System.out.println(idToProduct.get(10));

    }

}
