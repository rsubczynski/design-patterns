package kreacyjne.obserwator.homework.forecast;

import kreacyjne.obserwator.homework.WeatherForecast;

public interface Observer {
    default void updateForecast(WeatherForecast weatherForecast) {
        System.out.println(getClass().getSimpleName()
                + " - nowa prognoza pogody: " + weatherForecast.getTemperature()
                + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
