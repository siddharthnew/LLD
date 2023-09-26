package designPatterns.HW.CalculatorApp.factory;

import designPatterns.HW.CalculatorApp.entity.ICalculator;

public interface ICalculatorFactory {

    ICalculator createCalculator();
}
