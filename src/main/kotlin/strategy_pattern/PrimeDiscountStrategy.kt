package strategy_pattern

class PrimeDiscountStrategy: DiscountStrategy {
    // Prime会员打85折
    override fun getDiscount(totalPrice: Float): Float {
        return totalPrice * 0.85f
    }
}