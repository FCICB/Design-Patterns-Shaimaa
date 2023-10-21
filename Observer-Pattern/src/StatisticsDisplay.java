public class StatisticsDisplay implements observer{
    public void update(float temp, float humidity, float pressure) {
        System.out.println(String.format("%f\t%f\t%f", temp, humidity, pressure));
    }
}
