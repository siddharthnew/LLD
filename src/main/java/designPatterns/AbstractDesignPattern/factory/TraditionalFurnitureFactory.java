package designPatterns.AbstractDesignPattern.factory;

import designPatterns.AbstractDesignPattern.FurnitureFactory;
import designPatterns.AbstractDesignPattern.enity.Sofa;
import designPatterns.AbstractDesignPattern.enity.Table;
import designPatterns.AbstractDesignPattern.traditionalType.TraditionalSofa;
import designPatterns.AbstractDesignPattern.traditionalType.TraditionalTable;

public class TraditionalFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new TraditionalSofa();
    }

    @Override
    public Table placeOrder() {
        return new TraditionalTable();
    }
}
