package com.pb.lelyuk.hw7;

public enum Size {
    XXS,
    XS,
    S,
    M,
    L;

    private String description;
    private Integer eurosize;


    public Size(String description, Integer eurosize) {
        this.description = description;
        this.eurosize = eurosize;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEurosize() {
        return eurosize;
    }

    public void setEurosize(Integer eurosize) {
        this.eurosize = eurosize;
    }

    public String getDescription() {
        String result1;
        if (description == XXS) {
            result1 = System.out.println("Детский размер");
        } else {
            result1 = System.out.println("Взрослый размер");
        }
        return result1;
    }

    public Integer getEurosize () {
        Integer result2;
        switch (eurosize){
            case XXS:
                result2 = 32;
                break;
            case XS:
                result2 = 34;
                break;
            case S:
                result2 = 36;
                break;
            case M:
                result2 = 38;
                break;
            case L:
                result2 = 40;
        }
        return result2;
    }
}
