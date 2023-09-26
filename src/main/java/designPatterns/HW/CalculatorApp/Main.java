package designPatterns.HW.CalculatorApp;

import designPatterns.HW.CalculatorApp.entity.AdvanceCalculator;
import designPatterns.HW.CalculatorApp.entity.BasicCalculator;
import designPatterns.HW.CalculatorApp.entity.ICalculator;
import designPatterns.HW.CalculatorApp.factory.AdvanceCalculatorFactory;
import designPatterns.HW.CalculatorApp.factory.BasicCalculatorFactory;
import designPatterns.HW.CalculatorApp.storage.FileStorage;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICalculator calculator = null;
        // Choose the type of calculator
        System.out.print("Enter calculator type (basic/advanced): ");
        String calculatorType = scanner.nextLine();
        if ("basic".equalsIgnoreCase(calculatorType)) {
            BasicCalculatorFactory basicFactory = new BasicCalculatorFactory();
             calculator = basicFactory.createCalculator();
        } else if ("advanced".equalsIgnoreCase(calculatorType)) {
            AdvanceCalculatorFactory advanceCalculatorFactory = new AdvanceCalculatorFactory();
            calculator = advanceCalculatorFactory.createCalculator();
        } else {
            System.out.println("Invalid calculator type. Using Basic Calculator by default.");
            BasicCalculatorFactory basicFactory = new BasicCalculatorFactory();
            calculator = basicFactory.createCalculator();
        }
       while(true){
           System.out.println("Calculator Menu:");
           System.out.println("1. Perform Calculation");
           System.out.println("2. View Past Calculations");
           System.out.println("3. Exit");
           System.out.print("Enter your choice: ");

           int choice = scanner.nextInt();
           scanner.nextLine(); // Consume newline

           switch (choice){
               case 1 :
                   performCalculation(calculator,scanner);
                   break;
               case 2 :
                   viewPastCalculation();
               case 3 :
                   scanner.close();
                   System.exit(0);
               default:
                   System.out.println("Invalid choice. Please try again.");

           }
       }
    }

    private static void viewPastCalculation() {
        List<String> pastCalculations = FileStorage.loadCalculations();
        if (pastCalculations.isEmpty()) {
            System.out.println("No past calculations available.");
        } else {
            System.out.println("Past Calculations:");
            for (String calculation : pastCalculations) {
                System.out.println(calculation);
            }
        }
    }

    public static void performCalculation(ICalculator calculator,Scanner scanner){
        String operation = "";
        if(calculator instanceof BasicCalculator){
            operation = "+";
        }
        else if(calculator instanceof AdvanceCalculator){
            operation = "*";
        }

        System.out.print("Enter operand 1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter operand 2: ");
        double operand2 = scanner.nextDouble();

        double result = calculator.calculate(operand1, operand2);
        System.out.println("Result: " + result);

        String calculation = operand1 + " " + operation + " " + operand2 + " = " + result;
        FileStorage.saveCalculation(calculation);

    }
}
