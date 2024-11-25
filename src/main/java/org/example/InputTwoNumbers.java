package org.example;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class InputTwoNumbers implements  Inputter {
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public double[] getNumbers() {
        lock.lock();
        try (Scanner scanner = new Scanner(System.in)) {
            double num1 = getNumberFromUser(scanner, "first");
            double num2 = getNumberFromUser(scanner, "second");
            return new double[]{num1, num2};
        } catch (Exception e) {
            System.out.printf("An input error occurred: %s%n", e.getMessage());
            return new double[0];
        } finally {
            lock.unlock();
        }
    }

    private double getNumberFromUser(Scanner scanner, String serialNumber) {
        System.out.printf("Enter %s number: ", serialNumber);
        while (!scanner.hasNextDouble()) {
            System.out.printf("Please re-enter %s number: ", serialNumber);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}