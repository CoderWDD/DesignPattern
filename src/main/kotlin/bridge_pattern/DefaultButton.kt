package bridge_pattern

class DefaultButton: ButtonInterface {
    override fun createButton() {
        println("Default Button was created~")
    }
}