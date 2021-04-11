package com.hometest.model;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String address;
    protected int grade = 1;
    private Employee manager;


    public Employee(int id, String name, String address, Employee manager) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.manager = manager;
    }

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

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

    public int getGrade() {
        return grade;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getGrade() == employee.getGrade() && getName().equals(employee.getName())
                && getAddress().equals(employee.getAddress()) && getManager().equals(employee.getManager());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getGrade());
    }
}