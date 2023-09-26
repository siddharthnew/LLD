package designPatterns.AbstractDesignPattern.traditionalType;

import designPatterns.AbstractDesignPattern.enity.Sofa;

public class TraditionalSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("sit on traditional sofa");
    }
}
