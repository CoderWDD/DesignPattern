import flyweight_pattern.ShapeFactory
import org.junit.Test

class FlyweightPatternTest {
    @Test
    fun testFlyweight(){
        val colors = arrayOf("Red", "Green", "Blue")
        for (i in 1..20){
            val circle = ShapeFactory.getCircle(i % 5)
            circle.draw(i * 2, i * 3, colors[i % 3])
        }
    }
}