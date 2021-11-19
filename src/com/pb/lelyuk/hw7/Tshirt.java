package com.pb.lelyuk.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Man dresses Tshirt " + "размер " + size.name() + ", европейский размер " + size.getEurosize() + "-" + size.getDescription() +
                ",  цвет " + colour + ", цена " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women dresses Tshirt " + "размер " + size.name() + ", европейский размер " + size.getEurosize() + "-" + size.getDescription() +
                ",  цвет " + colour + ", цена " + price);
    }
}
