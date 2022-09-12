package facade_pattern

class Facade {
    private var keyBoard: Computer = KeyBoard()
    private var mouse: Computer = Mouse()
    private var monitor: Computer = Monitor()

    fun dispenseMonitor(){
        monitor.start()
    }

    fun dispenseMouse(){
        mouse.start()
    }

    fun dispenseKeyboard(){
        keyBoard.start()
    }
}