package designPatterns.FactoryDesignPattern.Logger.factory;

import designPatterns.FactoryDesignPattern.Logger.entity.ILogger;

public interface ILoggerFactory {

    ILogger createLogger();
}
