package org.example;

public class Calculator {
    private final Operation operation;
    private final Inputter inputter;

    public Calculator(Operation operation, Inputter inputter) {
        this.operation = operation;
        this.inputter = inputter;
    }

    public void calculate() {
        double[] numbers = inputter.getNumbers();
        double result = operation.performOperation(numbers);
        System.out.printf("Result of %s: %s%n", operation.getOperationName(), result);
    }
}