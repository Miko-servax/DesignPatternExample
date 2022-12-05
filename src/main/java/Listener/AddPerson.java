package Listener;

public class AddPerson extends Boss implements PersonFactory{

    @Override
    public Person createPerson() {
        super.update();
        return new Person();
    }
}
