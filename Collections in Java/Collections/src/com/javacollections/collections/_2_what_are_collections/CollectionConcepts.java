package com.javacollections.collections._2_what_are_collections;

import com.javacollections.collections.common.Product;

import java.util.Arrays;

public class CollectionConcepts {
    public static void main(String[] args) {
        var door = new Product("wooden", 35);
        var floorPanel = new Product("Floor Panel", 25);

        //create
        Product[] products = {door, floorPanel};

        //Print
        System.out.println(Arrays.toString(products));



    }
}
