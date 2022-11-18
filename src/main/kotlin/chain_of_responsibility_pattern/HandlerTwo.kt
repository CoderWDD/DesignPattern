package chain_of_responsibility_pattern

class HandlerTwo: AbstractHandler() {
    override fun handleProcess(handleCondition: Int) {
        if (handleCondition <= 0 || handleCondition > 9) {
            println("HandlerTwo handle the case")
        }else{
            nextHandler.handleProcess(handleCondition)
        }
    }
}