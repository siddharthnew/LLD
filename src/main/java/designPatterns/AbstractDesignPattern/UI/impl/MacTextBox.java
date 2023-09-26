package designPatterns.AbstractDesignPattern.UI.impl;

import designPatterns.AbstractDesignPattern.UI.ITextBox;

public class MacTextBox implements ITextBox {
    @Override
    public void textBox(String text) {
        System.out.println("Mac Text Box called");
    }
}
