package com.javacollections.collections._4_maps;

import com.javacollections.collections._4_maps.Product;
import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {
    private final Map<Integer, Product> idToProduct = new HashMap<>();


    @Override
    public Product lookupById(int id) {
        return idToProduct.get(id);
    }

    @Override
    public void addProduct(Product productToAdd) {
        var id = productToAdd.getId();
        if(idToProduct.containsKey(id)){
            throw new IllegalArgumentException("Unable to add product, duplicate id for " + productToAdd);
        }
    }

    @Override
    public void clear() {
        idToProduct.clear();
    }
}
