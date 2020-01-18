package ru.ryazanov.HSE.GUI.Android;

import ru.ryazanov.HSE.GUI.GUIFactory;
import ru.ryazanov.HSE.GUI.UIButton;
import ru.ryazanov.HSE.GUI.UIMenu;
import ru.ryazanov.HSE.GUI.UIScrollbar;

public class AndroidFactory implements GUIFactory {
    @Override
    public UIButton CreateButton() {
        return new AndroidButton();
    }

    @Override
    public UIMenu CreateMenu() {
        return new AndroidMenu();
    }

    @Override
    public UIScrollbar CreateScrollbar() {
        return new AndroidScrollbar();
    }
}
