package com.Composite;

public class SmartHomeEveningScenario extends SmartHomeScenario {
    public SmartHomeEveningScenario(SmartGroup floors, SmartGroup lights, SmartGroup curtains, SmartTV tv) {
        super(floors, lights, curtains, tv);
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            System.out.println("Evening scenario enabled!");
            Floors.setEnabled(true);
            Lights.setEnabled(true);
            Curtains.setEnabled(true);
            TV.setEnabled(true);
        } else {
            System.out.println("Evening scenario disabled!");
            super.setEnabled(true);
        }
    }
}
