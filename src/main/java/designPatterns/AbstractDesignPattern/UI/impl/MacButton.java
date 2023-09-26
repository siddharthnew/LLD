package designPatterns.AbstractDesignPattern.UI.impl;

import designPatterns.AbstractDesignPattern.UI.IButton;

import javax.crypto.Mac;

public class MacButton implements IButton {
    @Override
    public void pressButton() {
        System.out.println("mac press button called");
    }
}
