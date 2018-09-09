package com.codecool.uml.overloading;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Supplier extends Product{
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String name;
    private String description;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public List<Product> getProducts(){
//        return getAllProductsBy(this.name);
//    }

    @Override
    public String toString() {
        return "Supplier: id: " + getId() + " name: " + getName();
    }

    // constructors
    public Supplier(){
    }

    public Supplier(String name, String description){
        this.id = count.incrementAndGet();
        this.name = name;
        this.description = description;
    }

}
