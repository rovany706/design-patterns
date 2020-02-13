package com.Composite;

public abstract class SmartHomeScenario extends SmartHomeComponent {
    protected SmartGroup Floors;
    protected SmartGroup Lights;
    protected SmartGroup Curtains;
    protected SmartTV TV;

    public SmartHomeScenario(SmartGroup floors, SmartGroup lights, SmartGroup curtains, SmartTV tv) {
        Floors = floors;
        Lights = lights;
        Curtains = curtains;
        TV = tv;
    }

    @Override
    public void setEnabled(boolean enabled) {
        // Standard scenario
        System.out.println("Standard scenario enabled!");
        Floors.setEnabled(false);
        Lights.setEnabled(true);
        Curtains.setEnabled(false);
        TV.setEnabled(false);
    }
}
