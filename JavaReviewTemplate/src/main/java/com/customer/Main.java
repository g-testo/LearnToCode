package com.customer;

public class Main {
    public static void main(String[] args) {
        OutdoorEquipmentStore outdoorEquipmentStore = new OutdoorEquipmentStore("REI", "medium");
        outdoorEquipmentStore.addCustomer(new Customer("Greg", false, 120.00f));
        System.out.println(outdoorEquipmentStore);
    }
}
