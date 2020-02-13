package com.Composite;

public class SmartHomeNightScenario extends SmartHomeScenario {

    public SmartHomeNightScenario(SmartGroup floors, SmartGroup lights, SmartGroup curtains, SmartTV tv) {
        super(floors, lights, curtains, tv);
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            System.out.println("Night scenario enabled!");
            Floors.setEnabled(false);
            Lights.setEnabled(false);
            Curtains.setEnabled(true);
            TV.setEnabled(false);
        } else {
            System.out.println("Night scenario disabled!");
            super.setEnabled(true);
        }
    }
}
