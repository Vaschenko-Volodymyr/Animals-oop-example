package com.company;

import com.company.animals.Animal;
import com.company.animals.Horse;
import com.company.animals.Human;
import com.company.animals.Sparrow;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Human());
        animals.add(new Horse());
        animals.add(new Sparrow());

        for (Animal animal : animals) {
            animal.printYourself();
        }
    }
}
