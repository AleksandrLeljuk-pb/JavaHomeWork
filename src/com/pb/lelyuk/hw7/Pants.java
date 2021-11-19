package com.pb.lelyuk.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Man dresses pants" + "размер " + size.name() + ", европейский размер " + size.getEurosize() + "-" + size.getDescription() +
                ",  цвет " + colour + ", цена " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women dresses pants " + "размер " + size.name() + ", европейский размер " + size.getEurosize() + "-" + size.getDescription() +
                ",  цвет " + colour + ", цена " + price);
    }
}
