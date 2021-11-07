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



    }

}
