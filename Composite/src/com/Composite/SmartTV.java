package com.Composite;

public class SmartTV extends SmartHomeComponent{
    public SmartTV(String name) {
        Name = name;
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        System.out.printf("Smart TV '%s' is now %s\n", Name, Enabled ? "enabled" : "disabled");
    }
}
