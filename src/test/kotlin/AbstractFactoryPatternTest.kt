import abstract_factory_pattern.ColorCategory
import abstract_factory_pattern.FactoryProducer
import abstract_factory_pattern.ParameterCategory
import abstract_factory_pattern.ShapeCategory
import org.testng.annotations.Test

class AbstractFactoryPatternTest {
    @Test
    /*
    output:
        Square draw
        Circle draw
        Rectangle draw
        Red alpha
        Gray alpha
        Black alpha
     */
    fun abstractFactoryTest(){
        val shapeFactory = FactoryProducer.getFactory(ParameterCategory.Shape)
        shapeFactory.getShape(ShapeCategory.Square)?.draw()
        shapeFactory.getShape(ShapeCategory.Circle)?.draw()
        shapeFactory.getShape(ShapeCategory.Rectangle)?.draw()

        val colorFactory = FactoryProducer.getFactory(ParameterCategory.Color)
        colorFactory.getColor(ColorCategory.Red)?.alpha()
        colorFactory.getColor(ColorCategory.Gray)?.alpha()
        colorFactory.getColor(ColorCategory.Black)?.alpha()
    }
}