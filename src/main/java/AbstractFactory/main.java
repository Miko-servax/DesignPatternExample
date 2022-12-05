package AbstractFactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {

    @Test
    public void test(){
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Phone huaweiPhone = huaweiFactory.createPhone();
        Phone xiaomiPhone = xiaomiFactory.createPhone();
        Watch huaweiWatch = huaweiFactory.createWatch();
        Watch xiaomiWatch = xiaomiFactory.createWatch();
    }

}
