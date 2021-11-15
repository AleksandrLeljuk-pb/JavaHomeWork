package com.pb.lelyuk.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Pants(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women skirt, size " + getSize() + ", prise " + getPrice() + "USD, colour " + getColour() + ", Europe Size ");;
    }
}
