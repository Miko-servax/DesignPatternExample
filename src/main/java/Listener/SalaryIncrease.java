package Listener;

public class SalaryIncrease extends Boss{

    private Person person;

    public SalaryIncrease(Person person){
        this.person = person;
    }

    public void increase(Double salary){
        System.out.print(person.getName());super.increase();
        person.setSalary(person.getSalary()+salary);
    }

}
