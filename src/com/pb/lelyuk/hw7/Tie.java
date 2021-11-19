package com.pb.lelyuk.hw7;

public class Tie extends Clothes implements ManClothes{


    public Tie(Size size, float price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Man dresses tie " + "размер " + size.name() + ", европейский размер " + size.getEurosize() + "-" + size.getDescription() +
                ",  цвет " + colour + ", цена " + price);
    }
}
