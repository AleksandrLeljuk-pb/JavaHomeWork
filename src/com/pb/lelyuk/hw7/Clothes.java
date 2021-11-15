package com.pb.lelyuk.hw7;

public abstract class Clothes {
    private Size size;
    private Float price;
    private String colour;


    public Clothes(Size size, float price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public Float getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Clothes() {}
}
