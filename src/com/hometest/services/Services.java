package com.hometest.services;

import com.hometest.Exception.ElementNotFound;
import com.hometest.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Services {
    private static int maxGrade = 5;
    private static Employee employee1 = null;
    private static Employee employee2 = null;
    private static List<Employee> managersList1 = new ArrayList<>();

    public static Employee findManager(Employee emp1, Employee emp2) throws ElementNotFound {
        if (emp1.getManager() == null && emp2.getManager() == null) {
            throw new ElementNotFound("Manager not found!");
        }
        if (emp1.getGrade() <= emp2.getGrade()) {
            employee1 = emp1;
            employee2 = emp2;
        } else {
            employee2 = emp1;
            employee1 = emp2;
        }
        for (int i = 0; i <= maxGrade; i++) {
            if (employee1.getManager() == null) break;
            managersList1.add(employee1.getManager());
            employee1 = employee1.getManager();
            if (employee1.getGrade() == maxGrade) break;
        }
        for (int i = 0; i <= maxGrade; i++) {
            if (employee2.getManager() == null) break;
            if (managersList1.contains(employee2.getManager())) {
                break;
            } else {
                employee2 = employee2.getManager();
            }
        }
        return employee2.getManager();
    }
}
