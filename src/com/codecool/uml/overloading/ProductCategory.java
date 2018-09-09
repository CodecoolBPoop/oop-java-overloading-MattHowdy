package com.codecool.uml.overloading;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductCategory extends Product{
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String name;
    private String department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   // public  List<Product> getProducts(){
        //return getAllProductsBy(ProductCategory );
    //}


    @Override
    public String toString() {
        return "ProductCategory: id: " + getId() + " name: " + getName();
    }


    // constructors
    public ProductCategory(){
    }

    public ProductCategory(String name, String department, String description){
        this.id = count.incrementAndGet();
        this.name = name;
        this.department = department;
        this.description = description;
    }




}
