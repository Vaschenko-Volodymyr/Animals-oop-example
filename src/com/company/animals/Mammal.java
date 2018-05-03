package com.company.animals;

abstract class Mammal implements Animal {

    protected String getSubtype() {
        return "Mammal";
    }

    @Override
    public void printYourself() {
        System.out.println("I am a " + getAnimalName() + ", a subtype of a " + getSubtype());
    }
}
