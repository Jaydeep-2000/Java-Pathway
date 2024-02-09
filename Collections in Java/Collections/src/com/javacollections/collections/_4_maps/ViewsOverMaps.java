package com.javacollections.collections._4_maps;

import java.util.HashMap;


public class ViewsOverMaps {
    public static void main(String[] args) {
        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1,ProductFixtures.door);
        idToProduct.put(2,ProductFixtures.floorPanel);
        idToProduct.put(3,ProductFixtures.window);

        var ids = idToProduct.keySet();
//        ids.remove(1);
//        idToProduct.remove(2);
//        ids.add(4); //--error cannot add key without values
//        System.out.println(ids);
//        System.out.println(idToProduct);


//        var products = idToProduct.values();
//        products.remove(ProductFixtures.door);
//        idToProduct.remove(2);
//        System.out.println(products);
//        System.out.println(idToProduct);


        var entries = idToProduct.entrySet();
        for(var entry: entries){
            System.out.println(entry);
        }

        idToProduct.forEach((k, v) ->
            {
                System.out.println(k);
                System.out.println(v);
            }

                );

    }
}
