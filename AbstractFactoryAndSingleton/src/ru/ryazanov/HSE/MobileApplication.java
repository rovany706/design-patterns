package ru.ryazanov.HSE;

import ru.ryazanov.HSE.GUI.GUIFactory;
import ru.ryazanov.HSE.GUI.UIButton;
import ru.ryazanov.HSE.GUI.UIMenu;
import ru.ryazanov.HSE.GUI.UIScrollbar;

public class MobileApplication {
    UIButton Button;
    UIMenu Menu;
    UIScrollbar Scrollbar;

    public MobileApplication(GUIFactory Factory) {
        Button = Factory.CreateButton();
        Menu = Factory.CreateMenu();
        Scrollbar = Factory.CreateScrollbar();
    }
}
