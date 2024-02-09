package com.javacollections.collections._2_what_are_collections;

import com.javacollections.collections.common.Product;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {
        var door = new Product("wooden", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

        //create
        Product[] products = {door, floorPanel};

        //Print
        System.out.println(Arrays.toString(products));

        //Add
        //products[2] = window; --error as we cannot extend
        //System.out.println(Arrays.toString(products));

        products[1] = window; //even though arrays are immutable objects we can replace the elements
        System.out.println(Arrays.toString(products));

        //Add
        //add(element, array)
        products = add(window, products);
        System.out.println(Arrays.toString(products));

        //Duplicate
        products = add(window, products);
        System.out.println(Arrays.toString(products));

    }

    private static Product[] add(Product product, Product[] array){
        int length =  array.length;
        var newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
