package com.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Car {
    String model;
    int year;
    String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return model + " " + year + " " + color;
    }
}
class Owner {
    String name;

    Owner(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Ex2 {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 2015, "red");
        Car car2 = new Car("Audi", 2016, "blue");
        Owner owner1 = new Owner("John Doe");
        Owner owner2 = new Owner("Jane Doe");
        Map<Owner, Car> map1 = new HashMap<>();
        map1.put(owner1, car1);
        map1.put(owner2, car2);
        //------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Owner name");
        String name = scanner.nextLine();
        Owner keyOwner = new Owner(name);
        Car car = map1.get(keyOwner);
        if (car != null) {
            System.out.println(car);
        } else {
            System.out.println("Owner/Car not found");
        }


    }
}
