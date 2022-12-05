package Bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeachTwo extends Beach{

    public BeachTwo(sea sea){
        super(sea);
    }

    @Override
    public void info(){
        super.info();
        log.info("连接着沙滩2");
    }

}
