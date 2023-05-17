package com.customer;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Customer> customers;

    public Store(String name) {
        this.name = name;
        this.customers = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
