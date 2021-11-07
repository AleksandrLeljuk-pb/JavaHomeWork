package com.pb.lelyuk.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Pedigree", "Budka", "bark", "Pluto");
        animals[1] = new Cat("mice", "roof", "meow", "Tom");
        animals[2] = new Horse("hay", "stable", "neigh", "Holstomer");

        Class clazz = Class.forName("com.pb.lelyuk.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {
            for (Animal animal: animals) {
                ((Veterinarian) obj).treatAnimal(animal);
            }
        }

// Проверка работы методов из первой части HW6:

        Animal anim = new Animal("meet", "location");
        anim.setAnimalName("Animal");
        //anim.setFood("meet");

        anim.makeNoise();
        anim.sleep();
        anim.eat();

        Dog doggy = new Dog("Pedigree", "Budka", "bark", "Pluto");
        doggy.setAnimalName("Dog");
        //doggy.setFood("meet");
        doggy.eat();
        doggy.makeNoise();
        doggy.sleep();
        System.out.println(doggy.hashCode());
        System.out.println("'" + doggy.getAnimalName() +"'" +  " равно 'мясо' - это " +doggy.equals("meet"));
        System.out.println(doggy.toString());


        Cat kitty = new Cat("mice", "roof", "meow", "Tom");
        kitty.setAnimalName("Cat");
        //kitty.setFood("meet");
        kitty.eat();
        kitty.makeNoise();
        kitty.sleep();
        System.out.println(kitty.hashCode());
        System.out.println("'" + kitty.getAnimalName() +"'" +  " равно 'мясо' - это " +kitty.equals("meet"));
        System.out.println(kitty.toString());

        Horse horsy = new Horse("hay", "stable", "neigh", "Holstomer");
        horsy.setAnimalName("Horse");
        //horsy.setFood("meet");
        horsy.eat();
        horsy.makeNoise();
        horsy.sleep();
        System.out.println(horsy.hashCode());
        System.out.println("'" + horsy.getAnimalName() +"'" +  " равно 'мясо' - это " +horsy.equals("meet"));
        System.out.println(horsy.toString());

        Veterinarian veter = new Veterinarian();
        veter.treatAnimal(horsy);
        veter.treatAnimal(kitty);
        veter.treatAnimal(doggy);




    }

}
