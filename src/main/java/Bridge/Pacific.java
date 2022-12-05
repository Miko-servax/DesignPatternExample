package Bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pacific implements sea{
    @Override
    public void log() {
        log.info("太平洋");
    }
}
