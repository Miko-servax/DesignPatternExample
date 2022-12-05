package Bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeachOne extends Beach{
    public BeachOne(sea sea) {
        super(sea);
    }

    @Override
    public void info() {
        super.info();
        log.info("连接沙滩1");
    }
}
