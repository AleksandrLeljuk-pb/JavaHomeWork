package com.pb.lelyuk.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {

        if(animal instanceof Dog) {
            System.out.println(((Dog) animal).getDogname() + " eat " + animal.getFood());
            System.out.println(((Dog) animal).getDogname()  +  " lives at " + animal.getLocation());
            System.out.println(" ");
        }
        if(animal instanceof Cat) {
            System.out.println(((Cat) animal).getCatname() + " eat " + animal.getFood());
            System.out.println(((Cat) animal).getCatname() +  " lives at  " + animal.getLocation());
            System.out.println(" ");
        }
        if(animal instanceof Horse) {
            System.out.println(((Horse) animal).getHorsename() + " eat " + animal.getFood());
            System.out.println(((Horse) animal).getHorsename() +  " lives at  " + animal.getLocation());
        }
    }
}
