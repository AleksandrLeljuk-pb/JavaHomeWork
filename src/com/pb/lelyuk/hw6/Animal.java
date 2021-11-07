package com.pb.lelyuk.hw6;

public class Animal {
    private String animalName;
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void makeNoise () {
        System.out.println(animalName + " makes nose");
    }

    public void eat() {
        System.out.println(animalName + " eats " + food);
    }

    public void sleep() {
        System.out.println(animalName + " sleeps");
    }

}
