package designPatterns.AbstractDesignPattern.UI.impl;

import designPatterns.AbstractDesignPattern.UI.ITextBox;

public class WindowTextBox implements ITextBox {
    @Override
    public void textBox(String text) {
        System.out.println("Window text box called");
    }
}
