package com.Composite;

public abstract class SmartHomeComponent {
    protected boolean Enabled;
    public String Name;

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }
}
