package behawioralne.obserwator.order;

import behawioralne.obserwator.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
