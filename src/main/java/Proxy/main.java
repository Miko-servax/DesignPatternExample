package Proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class main {

    @Test
    public void test(){
        ProxiedRole proxiedRole = new ProxiedRole();
        ProxyRole proxyRole = new ProxyRole(proxiedRole);
        TrueRole trueRole = new TrueRole("王二");
        // proxiedRole.toDoSth();
        proxyRole.toProxy();
        proxyRole.otherThings();
    }

}
