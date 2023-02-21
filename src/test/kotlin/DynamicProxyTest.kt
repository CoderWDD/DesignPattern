import org.junit.Test
import proxy_pattern.dynamic_proxy.DynamicProxy
import proxy_pattern.dynamic_proxy.UserInterface

class DynamicProxyTest {

    @Test
    fun testDynamic(){
        val dynamicProxy = DynamicProxy()
        val proxy: UserInterface = dynamicProxy.dynamicProxy()
        proxy.test()
    }
}