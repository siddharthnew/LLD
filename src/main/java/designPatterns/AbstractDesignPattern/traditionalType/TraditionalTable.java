package designPatterns.AbstractDesignPattern.traditionalType;

import designPatterns.AbstractDesignPattern.enity.Table;

public class TraditionalTable implements Table {
    @Override
    public void placeOrder() {
        System.out.println("traditional place order");
    }
}
