package bridge_pattern

class CustomButton: ButtonInterface {
    override fun createButton() {
        println("Custom Button was created~")
    }
}