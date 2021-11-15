package com.pb.lelyuk.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Pants(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Man Tshirt, size " + getSize() + ", prise " + getPrice() + "USD, colour " + getColour() + ", Europe Size ");
    }

    @Override
    public void dressWomen() {
        System.out.println("Women Tshirt, size " + getSize() + ", prise " + getPrice() + "USD, colour " + getColour() + ", Europe Size ");
    }
}
