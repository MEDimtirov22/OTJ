package com.crm.data;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private List<String> customers = new ArrayList<>();

    public void addCustomerToDatabase(String customerName) {
        customers.add(customerName);
        System.out.println("[Data Layer] Saved to database: " + customerName);
    }

    public List<String> getAllFromDatabase() {
        return customers;
    }
}