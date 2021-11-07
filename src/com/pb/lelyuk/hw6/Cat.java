package com.pb.lelyuk.hw6;

public class Cat extends Animal {
    private String foodcat = "mice";
    private String noisecat ;
    private String catname;

    public Cat(String food, String location, String noisecat, String catname) {
        super(food, location);
        this.noisecat = noisecat;
        this.catname = catname;
    }


    public String getFoodcat() {
        return foodcat;
    }

    public void setFoodcat(String foodcat) {
        this.foodcat = foodcat;
    }

    public String getNoisecat() {
        return noisecat;
    }

    public void setNoisecat(String noisecat) {
        this.noisecat = noisecat;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    @Override
    public void makeNoise () {
        System.out.println(getAnimalName() + " " + noisecat);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " eats " + foodcat);
    }

    @Override
    public int hashCode() {
        int code = 999;
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean equa = !super.equals(obj);
        return equa;
    }

}
