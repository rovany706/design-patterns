package ru.ryazanov.HSE;

import ru.ryazanov.HSE.GUI.GUIFactory;

public class Facility {
    private static Facility instance;

    private GUIFactory guiFactory;

    public GUIFactory getGuiFactory() {
        return guiFactory;
    }

    public void setGuiFactory(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public static Facility getInstance() {
        if (instance == null) {
                instance = new Facility();
        }
        return instance;
    }
}
