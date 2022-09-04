package abstract_factory_pattern.color_factory

import abstract_factory_pattern.AbstractButtonParameterFactory
import abstract_factory_pattern.ColorCategory
import abstract_factory_pattern.ShapeCategory
import abstract_factory_pattern.shape_factory.Shape

class ColorFactory: AbstractButtonParameterFactory() {
    override fun getShape(shape: ShapeCategory): Shape? = null

    override fun getColor(color: ColorCategory): Color {
        return when (color){
            is ColorCategory.Red -> Red()
            is ColorCategory.Gray -> Gray()
            is ColorCategory.Black -> Black()
        }
    }
}