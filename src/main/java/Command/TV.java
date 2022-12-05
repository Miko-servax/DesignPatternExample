package Command;

public class TV implements Receiver{

    @Override
    public void action1() {
        System.out.println("action1");
    }

    public void action2(){
        System.out.println("action2");
    }

}
