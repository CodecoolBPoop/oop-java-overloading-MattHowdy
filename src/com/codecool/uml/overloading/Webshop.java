package com.codecool.uml.overloading;


import java.util.Currency;
import java.util.Locale;

public class Webshop {

    public static void main(String[] args) {

	    Product dvd = new Product("dvd", 123, Currency.getInstance("USD"));
        Product cd = new Product("cd", 99, Currency.getInstance("USD"));
        Product vhs = new Product("vhs", 23, Currency.getInstance("USD"));

        System.out.println(dvd);
        System.out.println(cd);
        System.out.println(vhs);


        ProductCategory music = new ProductCategory("music", "entertainment", "entertainment start here");
        ProductCategory art = new ProductCategory("art", "theatre", "entertainment start here");
        System.out.println(music);
        System.out.println(art);

        Supplier babygrande = new Supplier("Baby Grande Records", "Vinne Paz");
        System.out.println(babygrande);
    }
}
