

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private final List<observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(observer observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);

        }
    }
    @Override
    public void removeObserver(observer observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (observer observer:observers)
        {
            observer.update(temp,humidity,pressure);
        }

    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurementsChange(float temp,float humidity,float pressure)
    {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
