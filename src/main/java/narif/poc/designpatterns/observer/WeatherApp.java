package narif.poc.designpatterns.observer;

public class WeatherApp {
    public static void main(String[] args) {
        final var weatherData = new WeatherData();

        final var currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        final var currentPressureDisplay = new CurrentPressureDisplay(weatherData);

        weatherData.weatherDataUpdated(10, 50, 20);
        System.out.println("------------------------------------------------------------");
        weatherData.weatherDataUpdated(40, 60, 40);
        System.out.println("------------------------------------------------------------");
        weatherData.weatherDataUpdated(20, 70, 30);
        System.out.println("------------------------------------------------------------");
    }
}
