package com.pb.lelyuk.hw7;

public abstract class Clothes {
    protected Size size;
    protected float price;
    protected String colour;


    public Clothes(Size size, float price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

}
