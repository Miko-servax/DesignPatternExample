package Adapter;

import org.junit.Test;

public class main {

    @Test
    public void test(){
        Computer computer = new Computer();
        computer.setName("天河一号");
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new USBAdapter(adaptee);
        adapter.computerConnect(computer.getName());

    }

}
