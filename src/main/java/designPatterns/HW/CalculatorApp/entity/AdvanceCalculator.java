package designPatterns.HW.CalculatorApp.entity;

public class AdvanceCalculator implements ICalculator {
    @Override
    public double calculate(double a, double b) {
        return a*b;

    }
}
