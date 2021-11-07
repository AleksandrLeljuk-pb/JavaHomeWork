package com.pb.lelyuk.hw6;

public class Horse extends Animal {
    private String foodhorse = "hay";
    private String noisehorse = "neigh";
    private String horsename;

    public Horse(String food, String location, String noisehorse, String horsename) {
        super(food, location);
        this.noisehorse = noisehorse;
        this.horsename = horsename;
    }


    public String getFoodhorse() {
        return foodhorse;
    }

    public void setFoodhorse(String foodhorse) {
        this.foodhorse = foodhorse;
    }

    public String getNoisehorse() {
        return noisehorse;
    }

    public void setNoisehorse(String noisehorse) {
        this.noisehorse = noisehorse;
    }

    public String getHorsename() {
        return horsename;
    }

    public void setHorsename(String horsename) {
        this.horsename = horsename;
    }

    @Override
    public void makeNoise () {
        System.out.println(getAnimalName() + " " + noisehorse);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " eats " + foodhorse);
    }

    @Override
    public int hashCode() {
        int code = 000;
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean equa = !super.equals(obj);
        return equa;
    }
}
