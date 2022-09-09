package strategy_pattern

class OverDiscountStrategy: DiscountStrategy {
    // 满100减20
    override fun getDiscount(totalPrice: Float): Float {
        return if (totalPrice >= 100) totalPrice - 20f else totalPrice
    }
}