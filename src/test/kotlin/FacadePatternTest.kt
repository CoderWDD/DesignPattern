import facade_pattern.Facade
import org.junit.Test

class FacadePatternTest {
    @Test
    fun facadeTest(){
        val facade = Facade()
        facade.dispenseKeyboard()
        facade.dispenseMonitor()
        facade.dispenseMouse()
    }
}