package designPatterns.FactoryDesignPattern.Logger.factory;
import designPatterns.FactoryDesignPattern.Logger.entity.ILogger;
import designPatterns.FactoryDesignPattern.Logger.entity.Info;


public class InfoFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new Info();
    }
}
