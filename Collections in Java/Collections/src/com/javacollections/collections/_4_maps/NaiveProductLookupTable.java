package com.javacollections.collections._4_maps;

import com.javacollections.collections._4_maps.Product;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable{

    private final List<Product> products = new ArrayList<>();

    @Override
    public Product lookupById(int id) {
        for(var product: products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }


    @Override
    public void addProduct(final Product productToAdd) {
        var id = productToAdd.getId();

        for(var product: products){
            if(product.getId() == productToAdd.getId()){
                throw new IllegalArgumentException("Unable to add product, duplicate id for " + productToAdd);
            }
        }
        products.add(productToAdd);
    }

    @Override
    public void clear() {
        products.clear();
    }
}
