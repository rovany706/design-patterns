package ru.ryazanov.HSE.GUI.iOS;

import ru.ryazanov.HSE.GUI.UIScrollbar;

public class iOSScrollbar implements UIScrollbar {
    @Override
    public void Write() {
        System.out.println(String.format("Platform: %s, Element: %s", "iOS", "Scrollbar"));
    }

    @Override
    public void Scroll() {
        System.out.println("iOS Scroll!");
    }
}
