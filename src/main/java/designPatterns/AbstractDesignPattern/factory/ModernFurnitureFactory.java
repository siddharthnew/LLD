package designPatterns.AbstractDesignPattern.factory;

import designPatterns.AbstractDesignPattern.FurnitureFactory;
import designPatterns.AbstractDesignPattern.enity.Sofa;
import designPatterns.AbstractDesignPattern.enity.Table;
import designPatterns.AbstractDesignPattern.modernType.ModernSofa;
import designPatterns.AbstractDesignPattern.modernType.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table placeOrder() {
        return new ModernTable();
    }
}
