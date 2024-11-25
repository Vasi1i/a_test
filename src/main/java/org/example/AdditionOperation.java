package org.example;

public class AdditionOperation implements Operation {
    private static final AdditionOperation INSTANCE = new AdditionOperation();
    private AdditionOperation() {}

    public static AdditionOperation getInstance() {
        return INSTANCE;
    }

    @Override
    public double performOperation(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    @Override
    public String getOperationName() {
        return "addition";
    }
}