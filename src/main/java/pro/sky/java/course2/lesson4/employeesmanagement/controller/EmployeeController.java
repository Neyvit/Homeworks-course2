package pro.sky.java.course2.lesson4.employeesmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.lesson4.employeesmanagement.data.Employee;
import pro.sky.java.course2.lesson4.employeesmanagement.service.EmployeeService;

import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    private final EmployeeService employees;

    public EmployeeController(EmployeeService employees) {
        this.employees = employees;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String lastName,
                                       @RequestParam String firstName) {
        return employees.addEmployee(lastName, firstName);
    }

    @GetMapping("/remove")
    public Employee deleteEmployee(@RequestParam String firstName,
                                   @RequestParam String lastName) {
        return employees.deleteEmployee(lastName, firstName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName,
                                 @RequestParam String lastName) {
        return employees.findEmployee(lastName, firstName);
    }

    @GetMapping("/all")
    public List<Employee> getEmployeesList() {
        return employees.getEmployeesList();
    }
}