package com.javacollections.collections._6_sets;

import com.javacollections.collections.common.Product;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import com.javacollections.collections.common.Supplier;

public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();

    public void addSupplier(final Supplier supplier){
        products.addAll(supplier.getProducts());
    }
    
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
