package com.gt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BakedGoodsExample {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("volcano", "This is the definition of a volcano");
        System.out.println(hashMap.get("volcano"));





//        getInventory();

    }

    public static ArrayList<BakedGood> getInventory(){
        ArrayList<String> eclairIngredients = new ArrayList<String>();
        eclairIngredients.add("Eggs");
        eclairIngredients.add("Flour");
        eclairIngredients.add("Sugar");
        BakedGood eclair = new BakedGood("Eclair", 5, eclairIngredients);

        ArrayList<String> cheeseCakeIngredients = new ArrayList<String>(
                Arrays.asList("Cream Cheese", "Eggs")
        );
        BakedGood cheeseCake = new BakedGood("Cheese Cake Jim", 55, cheeseCakeIngredients);
        ArrayList<BakedGood> inventory = new ArrayList<BakedGood>();
        inventory.add(eclair);
        inventory.add(cheeseCake);

        return inventory;
    }

    //

}

class BakedGood {
    private String name;
    private String type;
    private String flavor;
    private int price;
    private boolean containsNuts;
    private boolean isGlutenFree;
    // 2 ArrayLists
    private ArrayList<String> ingredients;
    private ArrayList<String> toppings;

    public BakedGood(String name, int price, ArrayList<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "BakedGood{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                ", containsNuts=" + containsNuts +
                ", isGlutenFree=" + isGlutenFree +
                ", ingredients=" + ingredients +
                ", toppings=" + toppings +
                '}';
    }
}
