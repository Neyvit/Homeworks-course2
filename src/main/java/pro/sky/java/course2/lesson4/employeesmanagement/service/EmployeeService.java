package pro.sky.java.course2.lesson4.employeesmanagement.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.lesson4.employeesmanagement.data.Employee;
import pro.sky.java.course2.lesson4.employeesmanagement.exception.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(String lastName, String firstName){
        Employee employee = new Employee(lastName, firstName);
        employees.add(employee);
        return employee;
    }

    public Employee deleteEmployee(String lastName, String firstName) {
        Employee employeeToDelete = new Employee(lastName, firstName);
        int index = employees.indexOf(employeeToDelete);
        if (index >= 0) {
            employees.remove(index);
            return employeeToDelete;
        }
        throw new EmployeeNotFoundException();
    }

    public Employee findEmployee(String lastName, String firstName) {
        Employee employeeToFind = new Employee(lastName, firstName);
        if (employees.contains(employeeToFind)) {
            return employeeToFind;
        }
        throw new EmployeeNotFoundException();
    }

    public List<Employee> getEmployeesList() {
        return new ArrayList<>(employees);
    }
}