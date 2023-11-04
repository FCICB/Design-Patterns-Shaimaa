public class TurnOffCommand implements Command{
    public Device device;
        TurnOffCommand(Device device)
        {
            this.device=device;
        }

    @Override
    public void execute() {
        device.turnOff();
    }
}
