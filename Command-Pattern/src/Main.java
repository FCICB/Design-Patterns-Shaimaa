public class Main {
    public static void main(String[] args) {
        Device device=new Device();
        RemoteControl remoteControl=new RemoteControl();
        Command turnOn=new TurnOnCommand(device);
        Command turnOff=new TurnOffCommand(device);
        Command customButton1= new CustomButtonCommand(device,1);
        Command customButton2= new CustomButtonCommand(device,2);
        remoteControl.setButton(0,turnOn);
        remoteControl.setButton(1,turnOff);
        remoteControl.setButton(2,customButton1);
        remoteControl.setButton(3,customButton2);
        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);

    }
}
