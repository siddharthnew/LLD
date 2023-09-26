package designPatterns.FactoryDesignPattern.Furniture.factory;

import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;
import designPatterns.FactoryDesignPattern.Furniture.model.Chair;

public class ChairFactory implements FurnitureFactory {

    @Override
    public IFurnitureItems createFurniture() {
        return new Chair();
    }
}
