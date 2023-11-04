public class Device {
    public  void turnOn()
    {
        System.out.println("Device is turned on");
    }
    public void turnOff()
    {
        System.out.println("Device is turned Off");
    }
    public void performCustomAction(int buttonNumber) {
        System.out.println("Custom action on button " + buttonNumber);
    }
}
