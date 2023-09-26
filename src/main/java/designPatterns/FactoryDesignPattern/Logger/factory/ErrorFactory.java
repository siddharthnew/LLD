package designPatterns.FactoryDesignPattern.Logger.factory;
import designPatterns.FactoryDesignPattern.Logger.entity.ILogger;
import designPatterns.FactoryDesignPattern.Logger.entity.Error;


public class ErrorFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new Error();
    }
}
