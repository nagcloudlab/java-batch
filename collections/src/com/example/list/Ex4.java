package com.example.list;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ByNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class ByIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class Ex4 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Apple", 600));
        products.add(new Product(2, "Banana", 100));
        products.add(new Product(3, "Orange", 400));
        products.add(new Product(4, "Mango", 200));
        products.add(new Product(4, "Mango", 200));

        //Collections.sort(products);
        //Collections.sort(products,new ByNameComparator());
        //Collections.sort(products,new ByIdComparator());
        displayProducts(products);

    }

    private static void displayProducts(List<Product> products) {
        for(Product product:products){
            System.out.println(product);
        }
    }


}
