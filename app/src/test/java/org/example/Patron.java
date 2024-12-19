package org.example;


public class Patron {
    // Attributes
    private String name;
    private int patronId;

    // Constructor
    public Patron(String name, int patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPatronId() {
        return patronId;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPatronId(int patronId) {
        this.patronId = patronId;
    }

    // Display patron details
    public void displayPatron() {
        System.out.println("Patron Name: " + name + ", ID: " + patronId);
    }
}
