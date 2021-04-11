package com.hometest.DB;

import com.hometest.Exception.ElementNotFound;
import com.hometest.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private static Map<Integer, Employee> employeesList = new HashMap<>();

    public static Employee addEmployee(Employee emp) {
        return employeesList.put(emp.getId(), emp);
    }

    public static Employee getEmployeeById(Integer id) throws ElementNotFound {
        if (employeesList.containsKey(id)) {
            return employeesList.get(id);
        } else {
            throw new ElementNotFound("No employee with id: " + id + " found!");
        }
    }

    public static Map<Integer, Employee> getEmployeesList() {
        return employeesList;
    }

}
