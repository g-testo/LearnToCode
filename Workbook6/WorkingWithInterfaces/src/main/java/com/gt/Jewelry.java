package com.gt;

public class Jewelry extends Asset {
    private double karat;

    public double estimateValue(){
        return 0;
    }

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

}