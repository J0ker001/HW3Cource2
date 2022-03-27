package pro.sky.hw3cource2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hw3cource2.service.CalculatorService;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String Welcome() {
        return "Привет, это мой первый калькулятор ";
    }


    @GetMapping("/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {

        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2
        );
    }

    @GetMapping("/minus")
    public String minus(@RequestParam double num1, @RequestParam double num2) {

        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2) {

        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
double x = 4.0/0.0;
double y = 4.0/x;
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);

    }
}
