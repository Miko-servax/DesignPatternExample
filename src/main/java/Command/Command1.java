package Command;

public class Command1 extends Command{
    // private Receiver receiver;
    public Command1(Receiver receiver) {
        super(receiver);
        // this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
        super.execute();
    }
}
