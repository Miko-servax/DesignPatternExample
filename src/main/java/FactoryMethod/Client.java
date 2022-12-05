package FactoryMethod;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class Client {

    @Test
    public void test(){
        BusCarFactory busCarFactory = new BusCarFactory();
        BusCar bus = (BusCar) busCarFactory.createCar();
        bus.setCarName("我的大巴车");
        bus.setCarPrice(1000);
    }

}
