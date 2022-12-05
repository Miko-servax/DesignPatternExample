package Adapter;

public class USBAdapter extends Adapter{

    private Adaptee adaptee;

    public USBAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void computerConnect(String name){
        adaptee.Connect(name);
    }

}
