package designPatterns.FactoryDesignPattern.Furniture.model;

import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;

public class Sofa implements IFurnitureItems {
    @Override
    public void display() {
        System.out.println("This is a sofa");
    }
}
