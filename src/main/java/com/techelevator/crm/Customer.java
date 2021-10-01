package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();

    // Constructors

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    // Second Constructor calls the first constructor (with "this()"), as indicated in the README

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    // Getters and Setters

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    // getBalanceDue implements the requirement of the Billable interface

    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double totalBalance = 0.0;

        for (String service : servicesRendered.keySet()) {
            totalBalance += servicesRendered.get(service);
        }

        return totalBalance;
    }
}
