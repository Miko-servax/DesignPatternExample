package Proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyRole {

    private ProxiedRole proxiedRole;

    public ProxyRole(ProxiedRole proxiedRole){
        this.proxiedRole = proxiedRole;
    }

    public void toProxy(){
        proxiedRole.toDoSth();
    }

    public void otherThings(){
        log.info("额外事件");
    }

}
