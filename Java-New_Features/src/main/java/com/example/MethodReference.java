package com.example;

import java.util.ArrayList;
import java.util.List;

class FoodLib {
    static List<String> vegItems = List.of("idly", "vada", "poha");
    public static boolean isVegetarian(String item) {
        return vegItems.contains(item);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        menu.add("idly");
        menu.add("vada");
        menu.add("poha");
        menu.add("biryani");
//        menu.removeIf(menuItem -> FoodLib.isVegetarian(menuItem));
        menu.removeIf(FoodLib::isVegetarian);
        System.out.println(menu);

    }
}
