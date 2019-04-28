package kreacyjne.obserwator.homework;

import kreacyjne.obserwator.homework.forecast.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
