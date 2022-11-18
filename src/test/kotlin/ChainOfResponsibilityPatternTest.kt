import adapter_pattern.CustomerItemData
import adapter_pattern.ItemAdapter
import chain_of_responsibility_pattern.HandlerOne
import chain_of_responsibility_pattern.HandlerTwo
import org.junit.Test

class ChainOfResponsibilityPatternTest {
    @Test
    fun chainOfResponsibilityTest(){
        val handlerOne = HandlerOne()
        val handlerTwo = HandlerTwo()
        handlerOne.nextHandler = handlerTwo
        handlerOne.handleProcess(10)
    }
}