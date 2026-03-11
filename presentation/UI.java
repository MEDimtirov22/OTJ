package com.crm.presentation;

import com.crm.business.CustomerManager;
import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Starter CRM ---");
        System.out.print("Enter customer name to register: ");

        String inputName = scanner.nextLine();

        manager.registerNewCustomer(inputName);

        System.out.println("--- Success! Registration finished ---");
    }
}