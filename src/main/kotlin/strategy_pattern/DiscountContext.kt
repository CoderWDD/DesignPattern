package strategy_pattern

class DiscountContext(private val strategy: DiscountStrategy) {
    fun getDiscountPrice(totalPrice: Float): Float{
        return strategy.getDiscount(totalPrice)
    }
}