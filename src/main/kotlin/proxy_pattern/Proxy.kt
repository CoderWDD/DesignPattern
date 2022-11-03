package proxy_pattern

class Proxy constructor(private val serviceInterface: ServiceInterface): ServiceInterface{
    override fun feedback() {
        println("proxy feedback is called")
        serviceInterface.feedback()
    }
}