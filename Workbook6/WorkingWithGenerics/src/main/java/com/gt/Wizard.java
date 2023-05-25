package com.gt;

public class Wizard extends Magician{

    @Override
    public void performIllusion() {
        System.out.println("...");
    }

    @Override
    public void chantSpell() {
        System.out.println("Homida, homida, homida");
    }
}
