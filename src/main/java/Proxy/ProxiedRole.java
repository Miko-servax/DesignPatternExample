package Proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxiedRole implements ProxyThing{

    public void toDoSth(){
      log.info("代理事件");
    }

}
