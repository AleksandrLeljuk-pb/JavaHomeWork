package com.pb.lelyuk.hw7;

public class Tie extends Clothes implements ManClothes{

    public Pants(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Man tie, size " + getSize() + ", prise " + getPrice() + "USD, colour " + getColour() + ", Europe Size ");
    }
}
