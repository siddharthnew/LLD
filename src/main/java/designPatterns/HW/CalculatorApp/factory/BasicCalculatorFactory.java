package designPatterns.HW.CalculatorApp.factory;

import designPatterns.HW.CalculatorApp.entity.BasicCalculator;
import designPatterns.HW.CalculatorApp.entity.ICalculator;

public class BasicCalculatorFactory implements ICalculatorFactory {
    @Override
    public ICalculator createCalculator() {
        return new BasicCalculator();
    }
}
