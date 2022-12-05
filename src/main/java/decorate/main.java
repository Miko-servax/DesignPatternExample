package decorate;

import org.junit.Test;

public class main {

    @Test
    public void test(){
        BaseImpl base = new BaseImpl();
        DecorateImpl decorate = new DecorateImpl(base);
        decorate.test();
    }

}
