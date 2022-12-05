package Listener;

import org.junit.Test;

public class main {

    @Test
    public void test(){
        Boss boss = new Boss("马化腾");
        AddPerson addPerson = new AddPerson();
        Person person = addPerson.createPerson();
        person.setName("麻花藤");
        person.setSalary(1000000.0);
        SalaryIncrease salaryIncrease = new SalaryIncrease(person);
        salaryIncrease.increase(1000.0);
    }

}
