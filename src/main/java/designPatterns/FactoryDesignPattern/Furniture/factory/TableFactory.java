package designPatterns.FactoryDesignPattern.Furniture.factory;

import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;
import designPatterns.FactoryDesignPattern.Furniture.model.Table;

public class TableFactory implements FurnitureFactory{

    @Override
    public IFurnitureItems createFurniture() {
        return new Table();
    }
}
