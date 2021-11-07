package com.pb.lelyuk.hw6;

public class Dog extends Animal {
    private String fooddog = "pedigree";
    private String noisedog = "bark";
    private String dogname = "Pluto";

    public Dog(String food, String location, String noisedog, String dogname) {
        super(food, location);
        this.noisedog = noisedog;
        this.dogname = dogname;
    }

    public String getFooddog() {
        return fooddog;
    }

    public void setFooddog(String fooddog) {
        this.fooddog = fooddog;
    }

    public String getNoisedog() {
        return noisedog;
    }

    public void setNoisedog(String noisedog) {
        this.noisedog = noisedog;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    @Override
    public void makeNoise () {
        System.out.println(getAnimalName() + " " + noisedog);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " eats " + fooddog);
    }

    @Override
    public int hashCode() {
        int code = 666;
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean equa = !super.equals(obj);
        return equa;
    }

    @Override
    public String toString() {
        String str = "Метод toString переопределен";
        return str;
    }
}
