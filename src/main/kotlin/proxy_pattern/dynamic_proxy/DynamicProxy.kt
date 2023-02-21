package proxy_pattern.dynamic_proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy


class DynamicProxy {
    fun dynamicProxy(): UserInterface {
        val userInterfaceImpl = UserInterfaceImpl()
        return Proxy.newProxyInstance(
            userInterfaceImpl.javaClass.classLoader,
            userInterfaceImpl.javaClass.interfaces
        ) { proxy, method, args ->
            if (method.name == "test") {
                // 通过代理，增强了原来的功能
                println("动态代理了对象")
                val obj = method.invoke(userInterfaceImpl, args)
                println("动态代理结束")
                obj
            }else {
                method.invoke(proxy, args)
            }
        } as UserInterface
    }
}