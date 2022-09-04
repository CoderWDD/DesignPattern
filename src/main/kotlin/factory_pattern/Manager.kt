package factory_pattern

class Manager: Worker {
    override fun work() {
        println("I am a manager. I am working.")
    }
}