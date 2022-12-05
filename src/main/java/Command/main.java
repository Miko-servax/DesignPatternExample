package Command;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {

    @Test
    public void test(){
        TV tv = new TV();
        Command1 command1 = new Command1(tv);
        command1.execute();
        Command2 command2 = new Command2(tv);
        command2.execute();
    }

}
