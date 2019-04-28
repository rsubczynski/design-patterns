package behawioralne.obserwator.homework;

import behawioralne.obserwator.homework.forecast.InternetNews;
import behawioralne.obserwator.homework.forecast.RadioNews;
import behawioralne.obserwator.homework.forecast.TvNews;


public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);

        weatherForecast.unregisterObserver(radioNews);
        System.out.println("-------------------------->");
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);
    }
}
