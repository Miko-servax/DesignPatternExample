package Strategy;

public class Person {

    private Strategy strategy;

    public Person(Strategy strategy){
        this.strategy = strategy;
    }

    public String  doSth(){
        return strategy.strategy();
    }

}
