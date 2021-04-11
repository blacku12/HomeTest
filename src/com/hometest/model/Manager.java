package com.hometest.model;

import java.util.Objects;

public class Manager extends Employee {

    private Employee employee1;
    private Employee employee2;


    public Manager(int id, String name, String address, int grade, Employee manager) {
        super(id, name, address, manager);
        super.grade = grade;
    }

    public Manager(int id, String name, String address, int grade) {
        super(id, name, address);
        super.grade = grade;
    }

    public Employee getEmployee1() {
        return employee1;
    }

    public void setEmployee1(Employee employee1) {
        this.employee1 = employee1;
    }

    public Employee getEmployee2() {
        return employee2;
    }

    public void setEmployee2(Employee employee2) {
        this.employee2 = employee2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(getEmployee1(), manager.getEmployee1()) && Objects.equals(getEmployee2(), manager.getEmployee2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmployee1(), getEmployee2());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee1=" + employee1 +
                ", employee2=" + employee2 +
                '}';
    }
}

