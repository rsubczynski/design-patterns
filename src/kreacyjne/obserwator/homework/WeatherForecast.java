package kreacyjne.obserwator.homework;

import kreacyjne.obserwator.homework.forecast.Observer;
import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;

    private Set<Observer> registerObservers = new HashSet<>();

    WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registerObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registerObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registerObservers.forEach(observer ->
                observer.updateForecast(this));
    }

    void updateForecast(int temperature, int pressure){
        setPressure(pressure);
        setTemperature(temperature);
        notifyObservers();
    }
}
