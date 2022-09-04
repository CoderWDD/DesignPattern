package abstract_factory_pattern

import abstract_factory_pattern.color_factory.ColorFactory
import abstract_factory_pattern.shape_factory.ShapeFactory

class FactoryProducer {
    companion object{
        fun getFactory(parameter: ParameterCategory): AbstractButtonParameterFactory{
            return when(parameter){
                is ParameterCategory.Shape -> ShapeFactory()
                is ParameterCategory.Color -> ColorFactory()
            }
        }
    }
}

sealed class ParameterCategory{
    object Shape: ParameterCategory()
    object Color: ParameterCategory()
}