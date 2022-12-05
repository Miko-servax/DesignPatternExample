package decorate;

public abstract class Decorate extends Base{

    protected Base base;

    protected Decorate(Base base){
        this.base = base;
    }

    public void test(){
        base.test();
    }

}
