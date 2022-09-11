import bridge_pattern.Button
import bridge_pattern.CustomButton
import bridge_pattern.DefaultButton
import org.testng.annotations.Test

class BridgePatternTest {
    @Test
    fun bridgeTest(){
        val defaultButton = Button(DefaultButton())
        defaultButton.create()
        val customButton = Button(CustomButton())
        customButton.create()
    }
}