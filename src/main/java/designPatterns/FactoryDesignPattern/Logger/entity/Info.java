package designPatterns.FactoryDesignPattern.Logger.entity;

public class Info implements ILogger{
    @Override
    public void message() {
        System.out.println("This is an Info message");
    }
}
