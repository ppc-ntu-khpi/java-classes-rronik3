package test;

import domain.Customer; 

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("Початкова інформація про клієнта:");
        customer.displayCustomerInfo();

        System.out.println("\nОновлення даних клієнта...");
        customer.setID(5);
        customer.setStatus(false);
        customer.setTotal(5000.75);

        // Виводимо оновлені дані
        System.out.println("\nОновлені дані клієнта:");
        customer.displayCustomerInfo();
    }
} 