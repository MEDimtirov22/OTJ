package com.crm.business;

import com.crm.data.DataStorage;

public class CustomerManager {
    private DataStorage storage = new DataStorage();

    public void registerNewCustomer(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("[Business Layer] Error: Name cannot be empty!");
            return;
        }

        System.out.println("[Business Layer] Processing: " + name);
        storage.addCustomerToDatabase(name);
    }
}