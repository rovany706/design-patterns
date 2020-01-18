package ru.ryazanov.HSE.GUI;

public interface GUIFactory {
    UIButton CreateButton();
    UIMenu CreateMenu();
    UIScrollbar CreateScrollbar();
}
