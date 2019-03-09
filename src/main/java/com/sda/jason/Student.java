package com.sda.jason;

public class Student {
    String name;
    String lastName;
    Adress address;

    public Student(String name, String lastName, Adress address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }
}
