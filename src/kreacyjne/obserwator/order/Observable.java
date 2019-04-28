package kreacyjne.obserwator.order;

import kreacyjne.obserwator.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
