package abstract_factory_pattern

import abstract_factory_pattern.color_factory.Color
import abstract_factory_pattern.shape_factory.Shape

abstract class AbstractButtonParameterFactory {
    abstract fun getShape(shape: ShapeCategory) : Shape?
    abstract fun getColor(color: ColorCategory) : Color?
}

sealed class ShapeCategory{
    object Circle: ShapeCategory()
    object Rectangle: ShapeCategory()
    object Square: ShapeCategory()
}

sealed class ColorCategory{
    object Red: ColorCategory()
    object Gray: ColorCategory()
    object Black: ColorCategory()
}