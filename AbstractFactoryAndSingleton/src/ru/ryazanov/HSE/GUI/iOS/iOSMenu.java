package ru.ryazanov.HSE.GUI.iOS;

import ru.ryazanov.HSE.GUI.UIMenu;

public class iOSMenu implements UIMenu {
    @Override
    public void Write() {
        System.out.println(String.format("Platform: %s, Element: %s", "iOS", "Menu"));
    }

    @Override
    public void Choose() {
        System.out.println("iOS Menu Choose!");
    }
}
