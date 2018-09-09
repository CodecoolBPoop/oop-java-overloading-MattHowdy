package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;



public class Product {
    private int id;
    private static AtomicInteger count = new AtomicInteger(0);
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private List<Product> productList;

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }


    public float getDefaultPrice() {
        return this.defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return this.supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){
        return this.productList;
    }

    public List<Product> getAllProductsBy(Supplier supplier){
        return this.productList;
    }


    @Override
    public String toString() {
        return "id: " + getId() + " name: " + getName() + " default price: "+ getDefaultPrice();
    }

    // consturctor
    public Product(){
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency){
        this.id = count.getAndIncrement();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }

}
