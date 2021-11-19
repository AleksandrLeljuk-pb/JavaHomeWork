package com.pb.lelyuk.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women dresses skirt " + "размер " + size.name() + ", европейский размер " + size.getEurosize() + "-" + size.getDescription() +
                ",  цвет " + colour + ", цена " + price);
    }
}
