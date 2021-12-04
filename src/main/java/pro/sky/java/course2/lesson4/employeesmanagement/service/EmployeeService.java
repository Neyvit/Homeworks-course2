package pro.sky.java.course2.lesson4.employeesmanagement.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.lesson4.employeesmanagement.data.Employee;
import pro.sky.java.course2.lesson4.employeesmanagement.exception.EmployeeNotFoundException;
import pro.sky.java.course2.lesson4.employeesmanagement.exception.OverfilledArrayException;

@Service
public class EmployeeService {
    private static final Employee[] employees = new Employee[10];

/*    employees[0] = new Employee("Gorbunov", "Daniil");
    employees[1] = new Employee("Kirichev", "Kirill");
    employees[2] = new Employee("Radzhabov", "Tamerlan");
    employees[3] = new Employee("Shishkin", "Egor");
    employees[4] = new Employee("Elanova", "Irina");
    employees[5] = new Employee("Komlev", "Vitalii");
    employees[6] = new Employee("Strongman", "Maxim");
    employees[7] = new Employee("Selieva", "Mariia");
    employees[8] = new Employee("Starikov", "Dmitrii");
    employees[9] = new Employee("Simikchi", "Zarema");*/

    public static Employee addEmployee(String lastName, String firstName){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(lastName, firstName);
                return employees[i];
            }
        }
        throw new OverfilledArrayException();
    }

    public static Employee deleteEmployee(String lastName, String firstName) {
        Employee employeeToDelete = new Employee(lastName, firstName);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].equals(employeeToDelete)) {
                employees[i] = null;
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException();
    }

    public static Employee findEmployee(String lastName, String firstName) {
        Employee employeeToFind = new Employee(lastName, firstName);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].equals(employeeToFind)) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException();
    }
}