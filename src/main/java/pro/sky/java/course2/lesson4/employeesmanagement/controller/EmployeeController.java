package pro.sky.java.course2.lesson4.employeesmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.lesson4.employeesmanagement.data.Employee;
import pro.sky.java.course2.lesson4.employeesmanagement.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        return employeeService.addEmployee(lastName, firstName);
    }

    @GetMapping("/remove")
    public Employee deleteEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        return employeeService.deleteEmployee(lastName, firstName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        return employeeService.findEmployee(lastName, firstName);
    }
}