package com.Composite;

public class SmartHomeDayScenario extends SmartHomeScenario {
    public SmartHomeDayScenario(SmartGroup floors, SmartGroup lights, SmartGroup curtains, SmartTV tv) {
        super(floors, lights, curtains, tv);
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            System.out.println("Day scenario enabled!");
            Floors.setEnabled(true);
            Lights.setEnabled(false);
            Curtains.setEnabled(false);
            TV.setEnabled(true);
        } else {
            System.out.println("Day scenario disabled!");
            super.setEnabled(true);
        }
    }
}
