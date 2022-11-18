import builder_pattern.CardDetailBuilder
import org.junit.Test

class BuilderPatternTest {
    @Test
    fun builderTest(){
        val cardDetail =
            CardDetailBuilder(ImageUrl = "https://google.com", User = "CoderWu").setDescription("test Card Description")
        println(cardDetail)
    }
}