package Command;

public abstract class Command {

    public Receiver receiver;


    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute(){
        System.out.println("已执行命令");
    }



}
