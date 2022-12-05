package Bridge;

import org.junit.Test;

//和抽象工厂有点像，可先不看，这里举了沙滩和海洋的例子，有点抽象
public class main {

    @Test
    public void test(){
        Pacific pacific = new Pacific();
        Atlantic atlantic = new Atlantic();
        BeachOne beachOne = new BeachOne(pacific);
        BeachTwo beachTwo = new BeachTwo(atlantic);
        beachOne.info();
        beachTwo.info();

    }


}
