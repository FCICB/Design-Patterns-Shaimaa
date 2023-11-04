public class CustomButtonCommand implements Command{
    private Device device;
    private int buttonNumber;
    public CustomButtonCommand(Device device,int buttonNumber)
    {
        this.device=device;
        this.buttonNumber=buttonNumber;
    }

    @Override
    public void execute() {
        device.performCustomAction(buttonNumber);
    }
}
