package designPatterns.AbstractDesignPattern.UI.factory;

import designPatterns.AbstractDesignPattern.UI.IButton;
import designPatterns.AbstractDesignPattern.UI.ITextBox;

public interface GuiFactory {

    IButton pressButton();
    ITextBox createTextBox();

    static GuiFactory create(String osType){

        if(osType == "mac"){
            return new Macfactory();
        }
        if(osType == "window"){
            return new Windowfactory();
        }
      return null;
    }
}
