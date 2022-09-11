package bridge_pattern

abstract class AbstractButton constructor(protected var buttonInterface: ButtonInterface){
    abstract fun create()
}