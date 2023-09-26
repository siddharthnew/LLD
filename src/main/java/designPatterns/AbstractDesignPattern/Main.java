package designPatterns.AbstractDesignPattern;

import designPatterns.AbstractDesignPattern.enity.Sofa;
import designPatterns.AbstractDesignPattern.enity.Table;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory =  FurnitureFactory.createFactory("modern");
        Sofa sofa = modernFactory.createSofa();
        sofa.sitOn();

        //modern table
        Table table = modernFactory.placeOrder();
        table.placeOrder();

        //Traditional sofa and table
        FurnitureFactory traditionalFactory = FurnitureFactory.createFactory("traditional");
        Sofa traditionalSofa = traditionalFactory.createSofa();
        Table traditionalTable =traditionalFactory.placeOrder();

        traditionalSofa.sitOn();
        traditionalTable.placeOrder();

    }

}
