package designPatterns.FactoryDesignPattern.Logger;
import designPatterns.FactoryDesignPattern.Logger.entity.ILogger;
import designPatterns.FactoryDesignPattern.Logger.factory.DebugFactory;
import designPatterns.FactoryDesignPattern.Logger.factory.InfoFactory;

public class Main {
    public static void main(String[] args) {
        DebugFactory debugFactory = new DebugFactory();
        ILogger debugLogger = debugFactory.createLogger();
        debugLogger.message();

        InfoFactory infoFactory = new InfoFactory();
        ILogger infoLogger = infoFactory.createLogger();
        infoLogger.message();
    }
}
