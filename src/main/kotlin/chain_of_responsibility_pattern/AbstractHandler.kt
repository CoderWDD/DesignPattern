package chain_of_responsibility_pattern

abstract class AbstractHandler {
    lateinit var nextHandler: AbstractHandler
    abstract fun handleProcess(handleCondition: Int)
}