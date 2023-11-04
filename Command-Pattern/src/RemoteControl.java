import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> buttons;
    public RemoteControl()
    {
        buttons =new ArrayList<>(7);
        for (int i=0;i<7;i++)
            buttons.add(null);
    }
    public void setButton(int slot,Command command)
    {
        if (slot >= 0 && slot < buttons.size()) {
            buttons.set(slot, command);
        }
    }
    public void pressButton(int slot) {
        if (slot >= 0 && slot < buttons.size() && buttons.get(slot) != null) {
            buttons.get(slot).execute();
        }
    }
}
