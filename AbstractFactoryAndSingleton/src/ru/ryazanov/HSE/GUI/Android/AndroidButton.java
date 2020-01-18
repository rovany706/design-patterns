package ru.ryazanov.HSE.GUI.Android;

import ru.ryazanov.HSE.GUI.UIButton;

public class AndroidButton implements UIButton {

    @Override
    public void Write() {
        System.out.println(String.format("Platform: %s, Element: %s", "Android", "Button"));
    }

    @Override
    public void Click() {
        System.out.println("Android Button Click!");
    }
}
