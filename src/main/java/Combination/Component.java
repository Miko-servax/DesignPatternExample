package Combination;

//Final
public abstract class Component {

    protected String name;
    protected int level;

    //增删查
    public void add(Component component){
        throw new UnsupportedOperationException();
    }

    public void remove(Component component){
        throw new UnsupportedOperationException();
    }

    //获取指定子层级
    public Component getChild(int level){
        throw new UnsupportedOperationException();
    }

    //获取组件名称
    public String getName(){
        return name;
    }

    public abstract void printName();


}
