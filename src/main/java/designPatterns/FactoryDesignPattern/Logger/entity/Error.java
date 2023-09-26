package designPatterns.FactoryDesignPattern.Logger.entity;

public class Error implements ILogger{
    @Override
    public void message() {
        System.out.println("This is an error message");
    }
}
