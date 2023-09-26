package designPatterns.AbstractDesignPattern;

import designPatterns.AbstractDesignPattern.enity.Table;
import designPatterns.AbstractDesignPattern.factory.ModernFurnitureFactory;
import designPatterns.AbstractDesignPattern.enity.Sofa;
import designPatterns.AbstractDesignPattern.factory.TraditionalFurnitureFactory;
import designPatterns.AbstractDesignPattern.traditionalType.TraditionalSofa;

public interface FurnitureFactory {

    //Sofa sofa = createSofa();
    Sofa createSofa();
    Table placeOrder();

    static FurnitureFactory createFactory(String type) {
        if(type.equals("modern")){
            return new ModernFurnitureFactory();
        }
        else if(type.equals("traditional")){
            return new TraditionalFurnitureFactory();
        }
         return null;
    }
}
