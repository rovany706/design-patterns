package com.Composite;

public class SmartFloor extends SmartHomeComponent {
    public SmartFloor(String name) {
        Name = name;
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        System.out.printf("Smart Floor '%s' is now %s\n", Name, Enabled ? "enabled" : "disabled");
    }
}
