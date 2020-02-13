package com.Composite;

import java.util.ArrayList;

public class SmartGroup extends SmartHomeComponent{
    private ArrayList<SmartHomeComponent> Components;

    public SmartGroup(String name) {
        Components = new ArrayList<>();
        Name = name;
    }

    public void add(SmartHomeComponent component) {
        Components.add(component);
    }

    public void remove(SmartHomeComponent component) {
        Components.remove(component);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        System.out.printf("Smart group of '%s' is now %s\n", Name, Enabled ? "enabled" : "disabled");

        for (SmartHomeComponent component : Components) {
            component.setEnabled(enabled);
        }
    }
}
