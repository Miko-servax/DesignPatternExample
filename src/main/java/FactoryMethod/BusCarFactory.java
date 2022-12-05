package FactoryMethod;

public class BusCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BusCar();
    }
}
