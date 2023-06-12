package com.skypro.calculatortest.controller;

import com.skypro.calculatortest.exception.IllegalArgumentException;
import com.skypro.calculatortest.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
        private final CalculatorService calculatorService;

        public CalculatorController(CalculatorService calculatorService) {
            this.calculatorService = calculatorService;
        }
        @ExceptionHandler(value = IllegalArgumentException.class)
        public ResponseEntity<String> IllegalArgumentHandler(IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        @GetMapping("/plus")
        public String plus(@RequestParam int num1,@RequestParam int num2) {

            return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
        }
        @GetMapping("/minus")
        public String minus(@RequestParam int num1,@RequestParam int num2) {

            return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
        }
        @GetMapping("/multiply")
        public String multiply(@RequestParam int num1,@RequestParam int num2) {

            return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
        }
        @GetMapping("/divide")
        public String divide(@RequestParam int num1, @RequestParam int num2) {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        }
}

