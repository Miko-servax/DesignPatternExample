package Command;

public class Command2 extends Command{

    public Command2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action2();
        super.execute();
    }
}
