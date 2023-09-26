package designPatterns.FactoryDesignPattern.Furniture.factory;
import designPatterns.FactoryDesignPattern.Furniture.middleware.IFurnitureItems;
import designPatterns.FactoryDesignPattern.Furniture.model.Sofa;

public class SofaFactory implements FurnitureFactory {

    @Override
    public IFurnitureItems createFurniture() {
        return new Sofa();
    }
}
