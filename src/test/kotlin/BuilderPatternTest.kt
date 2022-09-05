import builder_pattern.CardDetailBuilder
import org.testng.annotations.Test

class BuilderPatternTest {
    @Test
    fun builderTest(){
        val cardDetail =
            CardDetailBuilder(ImageUrl = "https://google.com", User = "CoderWu").setDescription("test Card Description")
        println(cardDetail)
    }
}