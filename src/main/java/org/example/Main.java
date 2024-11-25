package org.example;

public class Main {
    public static void main(String[] args) {
        Operation addition = AdditionOperation.getInstance();
        Inputter inputTwoNumbers = new InputTwoNumbers();
        Calculator calculator = new Calculator(addition, inputTwoNumbers);
        calculator.calculate();
    }
}