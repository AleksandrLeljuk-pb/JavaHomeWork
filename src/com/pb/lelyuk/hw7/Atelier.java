package com.pb.lelyuk.hw7;

public class Atelier {

    public static void dressMan(Clothes[] clothes)
    {   System.out.println("Man clothes:");
        for (Clothes c:clothes){
            if (c instanceof ManClothes) ((ManClothes) c).dressMan();}
    }
    public static void dressWomen(Clothes[] clothes)
    {   System.out.println("Women clothes:");
        for (Clothes c:clothes){
            if (c instanceof WomenClothes) ((WomenClothes ) c).dressWomen();}
    }

    public static void main (String[] args) throws Exception {

        Tie tie1 = new Tie (Size.S,125.99f,"Black");
        Pants pants1 = new Pants (Size.XS,700.99f,"Green");
        Skirt skirt1 = new Skirt (Size.XXS, 30.50f,"Orange");
        Tshirt tshirt1 = new Tshirt (Size.L,125f,"Gray");

        Clothes[] clothes = new Clothes [] {tie1,pants1,skirt1,tshirt1};
        dressMan(clothes);
        dressWomen(clothes);

    }
}
