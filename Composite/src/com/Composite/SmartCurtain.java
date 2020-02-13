package com.Composite;

public class SmartCurtain extends SmartHomeComponent {
    public SmartCurtain(String name) {
        Name = name;
    }
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        System.out.printf("Smart Curtains '%s' is now %s\n", Name, Enabled ? "enabled" : "disabled");
    }
}
