package Combination;

import java.util.ArrayList;
import java.util.List;

public class Manger extends Component{


    private List<Component> list = new ArrayList<Component>();

    public Manger(String name,int level){
        this.name = name;
        this.level = level;
    }


    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int level) {
        return list.get(level);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void printName() {

        System.out.println(name);
        for (Component i: list) {
            i.printName();
        }

    }
}
