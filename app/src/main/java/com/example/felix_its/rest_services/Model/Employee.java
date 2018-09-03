package com.example.felix_its.rest_services.Model;

public class Employee {

    private int id;
    private String name;
    private String address;
    private String phonenumber;
    private long salary;
    private String designation;

    public Employee() {
        /** This is empty constructor*/
    }




    /** This is all constructor without id*/
    public Employee(String name, String address, String phonenumber, long salary, String designation) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.designation = designation;
    }

    /** This is all getter & setter*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
