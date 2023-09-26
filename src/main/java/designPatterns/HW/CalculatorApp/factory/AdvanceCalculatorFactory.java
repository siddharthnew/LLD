package designPatterns.HW.CalculatorApp.factory;

import designPatterns.HW.CalculatorApp.entity.AdvanceCalculator;
import designPatterns.HW.CalculatorApp.entity.ICalculator;

public class AdvanceCalculatorFactory implements ICalculatorFactory {
    @Override
    public ICalculator createCalculator() {
        return new AdvanceCalculator();
    }
}
