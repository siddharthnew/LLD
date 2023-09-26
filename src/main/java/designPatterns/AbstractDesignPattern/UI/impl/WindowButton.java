package designPatterns.AbstractDesignPattern.UI.impl;

import designPatterns.AbstractDesignPattern.UI.IButton;

public class WindowButton implements IButton {
    @Override
    public void pressButton() {
        System.out.println("Window Button called");
    }
}
