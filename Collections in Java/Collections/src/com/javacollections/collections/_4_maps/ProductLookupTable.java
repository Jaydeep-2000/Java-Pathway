package com.javacollections.collections._4_maps;

import com.javacollections.collections._4_maps.Product;

public interface ProductLookupTable {

    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}
