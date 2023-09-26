package designPatterns.HW.CalculatorApp.entity;

public class BasicCalculator implements ICalculator{
    @Override
    public double calculate(double a, double b) {
            return a+b;
    }
}
