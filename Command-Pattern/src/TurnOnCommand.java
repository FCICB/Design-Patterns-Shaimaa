public class TurnOnCommand implements Command{
    public Device device;
    TurnOnCommand(Device device)
    {
        this.device=device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
