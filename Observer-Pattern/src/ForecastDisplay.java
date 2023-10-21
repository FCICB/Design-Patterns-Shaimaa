public class ForecastDisplay implements observer{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println(String.format("%f\t%f\t%f", temp, humidity, pressure));
    }
}
