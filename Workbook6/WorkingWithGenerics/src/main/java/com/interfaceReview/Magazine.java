package com.interfaceReview;

public class Magazine implements Readable, Burnable {
    @Override
    public void read(){
        System.out.println("Reading magazine");
    }
    @Override
    public boolean burn(){
        return true;
    }
}
