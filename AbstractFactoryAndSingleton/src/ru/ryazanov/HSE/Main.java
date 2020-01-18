package ru.ryazanov.HSE;

import ru.ryazanov.HSE.GUI.Android.AndroidFactory;
import ru.ryazanov.HSE.GUI.iOS.iOSFactory;

public class Main {

    public static void main(String[] args) {
        Facility.getInstance().setGuiFactory(new AndroidFactory());
        MobileApplication androidApp = new MobileApplication(Facility.getInstance().getGuiFactory());
        interact(androidApp);

        Facility.getInstance().setGuiFactory(new iOSFactory());
        MobileApplication iOSApp = new MobileApplication(Facility.getInstance().getGuiFactory());
        interact(iOSApp);
    }

    public static void interact(MobileApplication application) {
        application.Button.Write();
        application.Button.Click();

        application.Menu.Write();
        application.Menu.Choose();

        application.Scrollbar.Write();
        application.Scrollbar.Scroll();
    }
}
