package com.javacollections.collections._2_what_are_collections;

import com.javacollections.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String[] args) {
        var door = new Product("wooden", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);


        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
/*
        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(door));
        System.out.println(products.remove(door));
        System.out.println(products.contains(door));
*/
        var toRemove =new ArrayList<Product>();
        toRemove.add(door);
        toRemove.add(floorPanel);

        System.out.println(products.containsAll(toRemove));
        products.removeAll(toRemove);
        System.out.println(products);
        System.out.println(products.containsAll(toRemove));

 /*
        //Iterator
        Iterator<Product> it = products.iterator();
        while(it.hasNext()){
            var product = it.next();
            System.out.println(product);
        }

        //removeIf
        //products.removeIf(product -> product.weight() > 20);

        System.out.println("products = "+ products);

        while(it.hasNext()){
            var product = it.next();
            if(product.weight()>20){
                it.remove();
            }        }
*/

    }
}
