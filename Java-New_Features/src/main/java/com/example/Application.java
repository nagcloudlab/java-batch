package com.example;

import com.example.model.Car;
import com.example.model.Insurance;
import com.example.model.Person;

import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Insurance insurance = new Insurance();
        insurance.name = "Abc insurance";

        Car car = new Car();
        car.insurance = Optional.of(insurance);

        Person person1 = new Person();
        person1.car = Optional.of(car);

        String p1CarInsuranceName =
                person1.car
                        .flatMap(car1 -> car1.insurance)
                        .map(insurance1 -> insurance1.name).orElse("No insurance");

        System.out.println(p1CarInsuranceName);

        Person person2 = new Person();
        String p2CarInsuranceName =
                person2.car
                        .flatMap(car1 -> car1.insurance)
                        .map(insurance1 -> insurance1.name).orElse("No insurance");
        System.out.println(p2CarInsuranceName);


    }
}
