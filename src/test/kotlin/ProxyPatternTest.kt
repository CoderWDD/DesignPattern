import org.jetbrains.annotations.TestOnly
import proxy_pattern.Proxy
import proxy_pattern.Service

class ProxyPatternTest {
    @TestOnly
    fun proxyTest(){
        val service = Service()
        val proxy = Proxy(service)
        proxy.feedback()
    }
}