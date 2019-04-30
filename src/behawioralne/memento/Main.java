package behawioralne.memento;

import behawioralne.memento.smart_app.SmartApp;
import behawioralne.memento.smart_app.SmartAppCareTaker;

public class Main {

    public static void main(String[] args) {

        SmartAppCareTaker smartAppCareTaker = new SmartAppCareTaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(2.0);
        smartApp.changeVersion(3.0);


        smartAppCareTaker.addMemento(smartApp.save());
        smartApp.load(smartAppCareTaker.getMemento(0));
    }
}
