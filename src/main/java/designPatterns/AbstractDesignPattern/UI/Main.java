package designPatterns.AbstractDesignPattern.UI;

import designPatterns.AbstractDesignPattern.UI.factory.GuiFactory;

public class Main {
    public static void main(String[] args) {
        GuiFactory guiFactory = GuiFactory.create("mac");
        IButton button = guiFactory.pressButton();
        button.pressButton();

        ITextBox textBox = guiFactory.createTextBox();
        textBox.textBox("Text testing");
    }
}
