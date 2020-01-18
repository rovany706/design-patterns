package ru.ryazanov.HSE.GUI.iOS;

import ru.ryazanov.HSE.GUI.UIButton;

public class iOSButton implements UIButton {

    @Override
    public void Write() {
        System.out.println(String.format("Platform: %s, Element: %s", "iOS", "Button"));
    }

    @Override
    public void Click() {
        System.out.println("iOS Button Click!");
    }
}
