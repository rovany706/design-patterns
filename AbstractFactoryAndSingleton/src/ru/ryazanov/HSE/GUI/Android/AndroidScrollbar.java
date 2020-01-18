package ru.ryazanov.HSE.GUI.Android;

import ru.ryazanov.HSE.GUI.UIScrollbar;

public class AndroidScrollbar implements UIScrollbar {

    @Override
    public void Write() {
        System.out.println(String.format("Platform: %s, Element: %s", "Android", "Scrollbar"));
    }

    @Override
    public void Scroll() {
        System.out.println("Android Scroll!");
    }
}
