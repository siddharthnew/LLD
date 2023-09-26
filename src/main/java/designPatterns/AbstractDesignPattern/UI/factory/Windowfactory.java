package designPatterns.AbstractDesignPattern.UI.factory;

import designPatterns.AbstractDesignPattern.UI.IButton;
import designPatterns.AbstractDesignPattern.UI.ITextBox;
import designPatterns.AbstractDesignPattern.UI.impl.WindowButton;
import designPatterns.AbstractDesignPattern.UI.impl.WindowTextBox;

public class Windowfactory implements GuiFactory{

    @Override
    public IButton pressButton() {
        return new WindowButton();
    }

    @Override
    public ITextBox createTextBox() {
        return null;
    }


}
