package com.gt;

public class WorkingWithClasses {
    public static void main(String[] args){
        Person greg = new Person(
                "Gregory",
                21,
                "04-10-1980",
                true,
                "000-00-0000"
        );
        greg.goForARun();
        greg.eat();
        System.out.println(greg.getEnergy());

        Person kossi = new Person();

        Person isaiah = new Person("Isaiah");

        Person seolah = new Person(false);

    }
}

class Person {
    // Properties
    private String name;
    private int age;
    private String birthday;
    private boolean hasTattoo;
    private String ssn;
    private int energy;


    // Constructor methods

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public Person(boolean hasTattoo){
        this.hasTattoo = hasTattoo;
    }

    public Person(String name, int age, String birthday, boolean hasTattoo, String ssn){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.hasTattoo = hasTattoo;
        this.ssn = ssn;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isHasTattoo() {
        return hasTattoo;
    }

    public void setHasTattoo(boolean hasTattoo) {
        this.hasTattoo = hasTattoo;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getEnergy() {
        return energy;
    }

    public void goForARun(){
        this.energy -= 60;
    }

    public void goForARun(int milesRan) {
        this.energy -= milesRan*10;
    }

    public void eat(){
        this.energy += 30;
    }
}
//
//map.getDirections("123 Center blvd, Saltlake, UT 39393");
//
//map.getDirections(2.348438484, 4.39348484);


