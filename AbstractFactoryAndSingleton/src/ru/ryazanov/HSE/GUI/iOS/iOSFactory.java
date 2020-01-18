package ru.ryazanov.HSE.GUI.iOS;

import ru.ryazanov.HSE.GUI.GUIFactory;
import ru.ryazanov.HSE.GUI.UIButton;
import ru.ryazanov.HSE.GUI.UIMenu;
import ru.ryazanov.HSE.GUI.UIScrollbar;

public class iOSFactory implements GUIFactory {
    @Override
    public UIButton CreateButton() {
        return new iOSButton();
    }

    @Override
    public UIMenu CreateMenu() {
        return new iOSMenu();
    }

    @Override
    public UIScrollbar CreateScrollbar() {
        return new iOSScrollbar();
    }
}
