package com.pb.lelyuk.hw7;

public enum Size {
    L("Взрослый размер", 40),
    M("Взрослый размер", 38),
    S("Взрослый размер", 36),
    XS("Взрослый размер", 34),
    XXS("Детский размер", 32);

    private String description;
    private int eurosize;


    Size(String description, int eurosize) {
        this.description = description;
        this.eurosize = eurosize;
    }


    public String getDescription() {
        return description;
    }

    public int getEurosize() {
        return eurosize;
    }

}


