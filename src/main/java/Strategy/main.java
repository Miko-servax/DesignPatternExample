package Strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {

    @Test
    public void test(){
        Strategy strategyOne = new StrategyOne();
        Person person = new Person(strategyOne);
        log.info(""+person.doSth());
    }

}
