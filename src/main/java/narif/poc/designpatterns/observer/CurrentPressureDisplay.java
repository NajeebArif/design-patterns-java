package narif.poc.designpatterns.observer;

public class CurrentPressureDisplay implements Observer, Display{

    private final WeatherData weatherData;

    private int currentTemp;
    private int currentPressure;
    private String currentPressureMsg;

    public CurrentPressureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(currentPressureMsg);
    }

    @Override
    public void update() {
        this.currentPressure = weatherData.getPressure();
        this.currentTemp = weatherData.getTemp();
        this.currentPressureMsg = "Current Pressure is "+this.currentPressure +" and temp is: "+this.currentTemp;
        display();
    }
}
