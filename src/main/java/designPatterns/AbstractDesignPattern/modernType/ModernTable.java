package designPatterns.AbstractDesignPattern.modernType;

import designPatterns.AbstractDesignPattern.enity.Table;

public class ModernTable implements Table {
    @Override
    public void placeOrder() {
        System.out.println("modern place order");

    }
}
