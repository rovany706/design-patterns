package ru.ryazanov.HSE.GUI.Android;

import ru.ryazanov.HSE.GUI.UIMenu;

public class AndroidMenu implements UIMenu {
    @Override
    public void Write() {
        System.out.println(String.format("Platform: %s, Element: %s", "Android", "Menu"));
    }

    @Override
    public void Choose() {
        System.out.println("Android Menu Choose!");
    }
}
