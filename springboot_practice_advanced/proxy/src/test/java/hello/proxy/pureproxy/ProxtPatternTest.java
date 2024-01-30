package hello.proxy.pureproxy;

import hello.proxy.pureproxy.code.ProxyPatternClient;
import hello.proxy.pureproxy.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxtPatternTest {

    @Test
    void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
    }
}
