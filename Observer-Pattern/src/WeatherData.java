import java.util.Random;

public class WeatherData {
    public static void main(String[] args) {
        final WeatherStation weatherStation = new WeatherStation();
        final CurrentConditions currentConditions = new CurrentConditions();
        weatherStation.registerObserver(currentConditions);
        final ForecastDisplay forecastDisplay=new ForecastDisplay();
        weatherStation.registerObserver(forecastDisplay);
        final StatisticsDisplay statisticsDisplay=new StatisticsDisplay();
        weatherStation.registerObserver(statisticsDisplay);
        final Random random = new Random();
        for (int i = 0; i < 5; i++) {
            weatherStation.setMeasurementsChange(random.nextFloat(), random.nextFloat(), random.nextFloat());
            System.out.println("***************************************");
        }
    }
}
