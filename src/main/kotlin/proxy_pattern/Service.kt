package proxy_pattern

class Service: ServiceInterface {
    override fun feedback() {
        println("service feedback is called")
    }
}