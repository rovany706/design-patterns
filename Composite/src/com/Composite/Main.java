package com.Composite;

public class Main {

    public static void main(String[] args) {
        // Smart floors
        SmartFloor livingRoomFloor = new SmartFloor("Living room floor");
        SmartFloor bedroomFloor = new SmartFloor("Bedroom floor");
        SmartFloor kitchenFloor = new SmartFloor("Kitchen floor");
        SmartGroup floors = new SmartGroup("Floors");
        floors.add(livingRoomFloor);
        floors.add(bedroomFloor);
        floors.add(kitchenFloor);

        //Smart lights
        SmartLight livingRoomLight = new SmartLight("Living room light");
        SmartLight bedroomLight = new SmartLight("Bedroom light");
        SmartLight kitchenLight = new SmartLight("Kitchen light");
        SmartGroup lights = new SmartGroup("Lights");
        lights.add(livingRoomLight);
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        //Smart curtains
        SmartCurtain livingRoomCurtain = new SmartCurtain("Living room curtain");
        SmartCurtain bedroomCurtain = new SmartCurtain("Bedroom curtain");
        SmartGroup curtains = new SmartGroup("Curtains");
        curtains.add(livingRoomCurtain);
        curtains.add(bedroomCurtain);
        
        SmartTV tv = new SmartTV("Samsung TV");

        SmartHomeScenario dayScenario = new SmartHomeDayScenario(floors, lights, curtains, tv);
        SmartHomeScenario eveningScenario = new SmartHomeEveningScenario(floors, lights, curtains, tv);
        SmartHomeScenario nightScenario = new SmartHomeNightScenario(floors, lights, curtains, tv);

        dayScenario.setEnabled(true);
        System.out.println();

        eveningScenario.setEnabled(true);
        System.out.println();

        eveningScenario.setEnabled(false);
        System.out.println();

        nightScenario.setEnabled(true);
    }
}
