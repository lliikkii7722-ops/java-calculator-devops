package com.devops;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        return Map.of("result", calculator.add(a, b));
    }

    @GetMapping("/subtract")
    public Map<String, Integer> subtract(@RequestParam int a, @RequestParam int b) {
        return Map.of("result", calculator.subtract(a, b));
    }

    @GetMapping("/multiply")
    public Map<String, Integer> multiply(@RequestParam int a, @RequestParam int b) {
        return Map.of("result", calculator.multiply(a, b));
    }

    @GetMapping("/divide")
    public Map<String, Integer> divide(@RequestParam int a, @RequestParam int b) {
        return Map.of("result", calculator.divide(a, b));
    }
}