package com.hometest;

import com.hometest.DB.DB;
import com.hometest.Exception.ElementNotFound;
import com.hometest.model.Employee;
import com.hometest.model.Manager;
import com.hometest.services.Services;

public class Main {

    public static void main(String[] args) throws ElementNotFound {

        populateDb();
        Employee E12 = DB.getEmployeeById(2);
        Employee E22 = DB.getEmployeeById(12);
        Employee E32 = DB.getEmployeeById(18);
        Employee E19 = DB.getEmployeeById(9);
        System.out.println(Services.findManager(E12, E22).getName());
        System.out.println(Services.findManager(E32, E19).getName());
    }

    private static void populateDb() {
        Employee E11 = new Employee(1, "E11", "address11");
        Employee E12 = new Employee(2, "E12", "address12");
        Employee E13 = new Employee(3, "E13", "address13");
        Employee E14 = new Employee(4, "E14", "address14");
        Employee E15 = new Employee(5, "E15", "address15");
        Employee E16 = new Employee(6, "E16", "address16");
        Employee E17 = new Employee(7, "E17", "address17");
        Employee E18 = new Employee(8, "E18", "address18");
        Employee E19 = new Employee(9, "E19", "address19");
        Manager E20 = new Manager(10, "E20", "address20", 2);
        Manager E21 = new Manager(11, "E21", "address21", 2);
        Manager E22 = new Manager(12, "E22", "address22", 2);
        Manager E23 = new Manager(13, "E23", "address23", 2);
        Manager E24 = new Manager(14, "E24", "address24", 2);
        Manager E25 = new Manager(15, "E25", "address25", 2);
        Manager E30 = new Manager(16, "E30", "address30", 3);
        Manager E31 = new Manager(17, "E31", "address31", 3);
        Manager E32 = new Manager(18, "E32", "address32", 3);
        Manager E33 = new Manager(19, "E33", "address33", 3);
        Manager E40 = new Manager(20, "E40", "address40", 4);
        Manager E41 = new Manager(21, "E41", "address41", 4);
        Manager E50 = new Manager(22, "E50", "address50", 5);

        E11.setManager(E20);
        E12.setManager(E21);
        E13.setManager(E22);
        E14.setManager(E22);
        E15.setManager(E23);
        E16.setManager(E24);
        E17.setManager(E24);
        E18.setManager(E25);
        E19.setManager(E25);
        E20.setManager(E30);
        E21.setManager(E30);
        E22.setManager(E31);
        E23.setManager(E32);
        E24.setManager(E33);
        E25.setManager(E33);
        E30.setManager(E40);
        E31.setManager(E40);
        E32.setManager(E41);
        E33.setManager(E41);
        E40.setManager(E50);
        E41.setManager(E50);

        E20.setEmployee1(E11);
        E21.setEmployee1(E12);
        E22.setEmployee1(E13);
        E22.setEmployee1(E14);
        E23.setEmployee1(E15);
        E24.setEmployee1(E16);
        E24.setEmployee2(E17);
        E25.setEmployee1(E18);
        E25.setEmployee2(E19);
        E30.setEmployee1(E20);
        E30.setEmployee2(E21);
        E31.setEmployee1(E22);
        E32.setEmployee1(E23);
        E33.setEmployee1(E24);
        E33.setEmployee2(E25);
        E40.setEmployee1(E30);
        E40.setEmployee2(E31);
        E41.setEmployee1(E32);
        E41.setEmployee2(E33);
        E50.setEmployee1(E40);
        E50.setEmployee2(E41);

        DB.addEmployee(E11);
        DB.addEmployee(E12);
        DB.addEmployee(E13);
        DB.addEmployee(E14);
        DB.addEmployee(E15);
        DB.addEmployee(E16);
        DB.addEmployee(E17);
        DB.addEmployee(E18);
        DB.addEmployee(E19);
        DB.addEmployee(E20);
        DB.addEmployee(E21);
        DB.addEmployee(E22);
        DB.addEmployee(E23);
        DB.addEmployee(E24);
        DB.addEmployee(E25);
        DB.addEmployee(E30);
        DB.addEmployee(E31);
        DB.addEmployee(E32);
        DB.addEmployee(E33);
        DB.addEmployee(E40);
        DB.addEmployee(E41);
        DB.addEmployee(E50);
    }
}
