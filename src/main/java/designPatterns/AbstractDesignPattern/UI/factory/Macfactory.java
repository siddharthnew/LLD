package designPatterns.AbstractDesignPattern.UI.factory;

import designPatterns.AbstractDesignPattern.UI.IButton;
import designPatterns.AbstractDesignPattern.UI.ITextBox;
import designPatterns.AbstractDesignPattern.UI.impl.MacButton;
import designPatterns.AbstractDesignPattern.UI.impl.MacTextBox;

public class Macfactory implements GuiFactory{
    @Override
    public IButton pressButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }

}
