package designPatterns.FactoryDesignPattern.Furniture.factory;
import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;

public interface FurnitureFactory {
    IFurnitureItems createFurniture();
}
