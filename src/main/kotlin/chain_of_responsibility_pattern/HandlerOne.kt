package chain_of_responsibility_pattern

class HandlerOne: AbstractHandler() {
    override fun handleProcess(handleCondition: Int) {
        if (handleCondition in 1..8) {
            println("HandlerOne handle the case")
        }else{
            println("HandlerOne cannot handle the case")
            nextHandler.handleProcess(handleCondition)
        }
    }
}