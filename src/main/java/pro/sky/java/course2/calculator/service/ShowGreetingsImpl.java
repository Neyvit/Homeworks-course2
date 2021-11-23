package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class ShowGreetingsImpl implements ShowGreetings {
    @Override
    public String showGreetings() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }
}