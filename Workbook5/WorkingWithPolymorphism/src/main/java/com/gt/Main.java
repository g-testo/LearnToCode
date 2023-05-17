package com.gt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // What is OOP?
        // Pillars of OOP
            // Inheritance
            // Encapsulation

            // Polymorphism "Many forms"

//        Human human = new Human();
//        human.eat();
//
//        Caveman caveman = new Caveman();
//        caveman.eat();
//
//        ModernPerson modernPerson = new ModernPerson();
//        modernPerson.eat();


        ////////////////////
        Caveman caveman = new Caveman();

        System.out.println(caveman.getClass());


        Object list = new ArrayList<>();
        Object string = new String();
    }
}