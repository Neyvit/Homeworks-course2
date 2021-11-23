package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;
import pro.sky.java.course2.calculator.service.ShowGreetings;

@RequestMapping("/calculator")
@RestController
public class FirstController {
    private final ShowGreetings greetings;
    private final CalculatorService calculatorService;

    public FirstController(ShowGreetings greetings, CalculatorService calculatorService) {
        this.greetings = greetings;
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String showGreetings() {
        return greetings.showGreetings();
    }

    @GetMapping( "/plus")
    public int sumUpNumbers(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2) {
        return calculatorService.sumUpNumbers(num1, num2);
    }

    @GetMapping( "/minus")
    public int subtractNumbers(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2) {
        return calculatorService.subtractNumbers(num1, num2);
    }

    @GetMapping( "/multiply")
    public int multiplyNumbers(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return calculatorService.multiplyNumbers(num1, num2);
    }

    @GetMapping( "/divide")
    public int divideNumbers(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return calculatorService.divideNumbers(num1, num2);
    }
}