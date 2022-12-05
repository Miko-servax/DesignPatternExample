package Bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Atlantic implements sea{
    @Override
    public void log() {
        log.info("大西洋");
    }
}
