package com.interfaceReview;

public class Book implements Readable, Burnable {
    private String condition;
    @Override
    public void read(){
        System.out.println("Reading book");
    }
    @Override
    public boolean burn(){
        return true;
    }

}
