package Combination;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {
    @Test
    public void test(){
        Manger manger1 = new Manger("管理员1", 1);
        manger1.add(new Employee("员工1",2));
        manger1.add(new Employee("员工2",2));
        manger1.add(new Employee("员工3",2));
        Manger manger2 = new Manger("管理员2", 1);
        Manger manger3 = new Manger("管理员3", 1);

        manger1.printName();

    }
}
