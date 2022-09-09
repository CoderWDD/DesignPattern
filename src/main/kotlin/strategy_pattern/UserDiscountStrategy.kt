package strategy_pattern

class UserDiscountStrategy: DiscountStrategy {
    // 普通用户打95折
    override fun getDiscount(totalPrice: Float): Float {
        return totalPrice * 0.95f
    }
}