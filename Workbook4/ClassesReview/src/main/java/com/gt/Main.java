package com.gt;

import com.ap.OutsidePackage;

public class Main {
    public static void main(String[] args) {
//        ArrayList<User> cupCarrier = new ArrayList<>();
//
//        User gregsCup = new User();
//
//        cupCarrier.add(gregsCup);
//        cupCarrier.add(new User("User 2", "U2", "u@2.com"));
//        cupCarrier.add(new User("User 3", "U3", "u@3.com"));
//        cupCarrier.add(new User("User 4", "U4", "u@4.com"));

//        User gregsEmptyInstance = new User();

//        User gregFullInstance = new User("Greg", "gtesto", "g@testo.com");

        int sum = OutsidePackage.add(10, 50);
    }
}

class User {
    private String name;
    private String username;
    private String email;
    public User() {}
    public User(String name, String username, String email) {
        this.name = name;
        this.username = username;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// Create a User class >> name, username, email
// >> Generator <<
// Two constructors: one that accepts no data, another that accepts all data
// Getters and setters for each property
// Override toString

// if complete:
// >> (Add two fields)
// Create two instances

//  public static void main(String[] args) // Method signature

// Access modifier
// Static modifier
// return type
// Method name
// Inputs/parameters

//  public static void customMethod();