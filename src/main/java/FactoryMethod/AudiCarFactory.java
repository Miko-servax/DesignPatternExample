package FactoryMethod;

public class AudiCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new AudiCar();
    }
}
