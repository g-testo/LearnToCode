package com.gt;

import java.util.HashMap;

public class HashMapCodeAlong {
    public static void main(String[] args) {
        String ssn1 = "555-55-5555"; // Key
        User user1 = new User("Torue"); // Value

        String ssn2 = "555-55-5556";
        User user2 = new User("Scarlet");

        String ssn3 = "555-55-5557";
        User user3 = new User("Jada");

        HashMap<String, User> userLookup = new HashMap<String, User>();

        userLookup.put(ssn1, user1);
        userLookup.put(ssn2, user2);
        userLookup.put(ssn3, user3);

        // Iterate through a HashMap
        for(String key: userLookup.keySet()){
            User currentUser = userLookup.get(key);
            // Jada has a ssn of 555..
            System.out.printf("%s has a ssn of %s\n", currentUser.getName(), key);
        }

//        User removedUser = userLookup.remove(ssn2);
//        System.out.println(removedUser);

//        userLookup.clear();
//        System.out.println(userLookup);



//        User retrievedUser = userLookup.get("555-55-5556");
//
//        System.out.println(retrievedUser);



    }



}

class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "User: " + this.name;
    }
}
