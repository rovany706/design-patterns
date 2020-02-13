package com.Composite;

public class SmartLight extends SmartHomeComponent {
    public SmartLight(String name) {
        Name = name;
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        System.out.printf("Smart Light '%s' is now %s\n", Name, Enabled ? "enabled" : "disabled");
    }
}
