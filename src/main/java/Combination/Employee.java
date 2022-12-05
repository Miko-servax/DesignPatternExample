package Combination;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Component{

    public Employee(String name,int level){
        this.name = name;
        this.level = level;
    }


    @Override
    public void printName() {
        System.out.println(name);
    }
}
