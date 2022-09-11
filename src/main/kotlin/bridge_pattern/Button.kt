package bridge_pattern

class Button constructor(buttonInterface: ButtonInterface): AbstractButton(buttonInterface) {
    override fun create() {
        buttonInterface.createButton()
    }
}