package strategy_pattern

interface DiscountStrategy {
    fun getDiscount(totalPrice: Float): Float
}