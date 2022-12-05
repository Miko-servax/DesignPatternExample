package decorate;

public class DecorateImpl extends Decorate{

    protected DecorateImpl(Base base) {
        super(base);
    }

    @Override
    public void test() {
        super.test();
        System.out.println("装饰方法");
    }
}
