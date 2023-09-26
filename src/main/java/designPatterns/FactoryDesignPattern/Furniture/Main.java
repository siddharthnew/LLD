package designPatterns.FactoryDesignPattern.Furniture;


import designPatterns.FactoryDesignPattern.Furniture.factory.ChairFactory;
import designPatterns.FactoryDesignPattern.Furniture.factory.SofaFactory;
import designPatterns.FactoryDesignPattern.Furniture.factory.TableFactory;
import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;

public class Main {
    public static void main(String[] args) {

        SofaFactory sofaFactory = new SofaFactory();
        ChairFactory chairFactory = new ChairFactory();
        TableFactory tableFactory = new TableFactory();

        IFurnitureItems sofaItems = sofaFactory.createFurniture();
        IFurnitureItems chairItems = chairFactory.createFurniture();
        IFurnitureItems tabItems = tableFactory.createFurniture();

        sofaItems.display();
        chairItems.display();
        tabItems.display();

       // System.out.println(IFurnitureItems.backup());


    }
}
