package ru.ryazanov.HSE;

import ru.ryazanov.HSE.GUI.Android.AndroidFactory;
import ru.ryazanov.HSE.GUI.iOS.iOSFactory;

/*
* Приложение с поддержкой графического интерфейса пользователя рассчитано на использование на различных платформах мобильных устройств, при этом внешний вид этого интерфейса должен соответствовать принятому стилю для той или иной платформы.
* Например, если это приложение установлено на iOS, то его кнопки, меню, полосы прокрутки должны отображаться в стиле, принятом для приложений iOS.
* Группой взаимосвязанных объектов в этом случае будут элементы графического интерфейса для конкретной платформы.
*/

public class Main {

    public static void main(String[] args) {
        MobileApplication androidApp = new MobileApplication(new AndroidFactory());
        interact(androidApp);

        MobileApplication iOSApp = new MobileApplication(new iOSFactory());
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
