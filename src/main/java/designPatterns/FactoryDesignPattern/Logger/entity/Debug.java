package designPatterns.FactoryDesignPattern.Logger.entity;

public class Debug implements ILogger {
    @Override
    public void message() {
        System.out.println("This is a debug message");
    }
}
