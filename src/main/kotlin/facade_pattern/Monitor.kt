package facade_pattern

class Monitor: Computer {
    override fun start() {
        println("Monitor has been connected~")
    }
}