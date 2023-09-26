package designPatterns.FactoryDesignPattern.Logger.factory;
import designPatterns.FactoryDesignPattern.Logger.entity.ILogger;
import designPatterns.FactoryDesignPattern.Logger.entity.Debug;


public class DebugFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new Debug();
    }
}
