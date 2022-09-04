package abstract_factory_pattern.shape_factory

import abstract_factory_pattern.AbstractButtonParameterFactory
import abstract_factory_pattern.ColorCategory
import abstract_factory_pattern.ShapeCategory
import abstract_factory_pattern.color_factory.Color

class ShapeFactory: AbstractButtonParameterFactory() {
    override fun getShape(shape: ShapeCategory): Shape {
        return when (shape){
            is ShapeCategory.Circle -> Circle()
            is ShapeCategory.Rectangle -> Rectangle()
            is ShapeCategory.Square -> Square()
        }
    }

    override fun getColor(color: ColorCategory): Color? = null
}