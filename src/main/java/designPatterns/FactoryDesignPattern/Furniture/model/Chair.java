package designPatterns.FactoryDesignPattern.Furniture.model;

import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;

public class Chair implements IFurnitureItems {
    @Override
    public void display() {
        System.out.println("This is a chair");
    }
}
