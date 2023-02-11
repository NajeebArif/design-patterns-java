package narif.poc.designpatterns.observer;

public class CurrentConditionDisplay implements Observer, Display{

    private final WeatherData weatherData;
    private int currentTemp;
    private int currentHumidity;
    private String currentConditionMsg;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.currentTemp = weatherData.getTemp();
        this.currentHumidity = weatherData.getHumidity();
        this.currentConditionMsg = "Currently Temperature is "+currentTemp+" and the Current Humidity is "+currentHumidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(currentConditionMsg);
    }
}
