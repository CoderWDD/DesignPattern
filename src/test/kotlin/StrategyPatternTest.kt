import org.testng.annotations.Test
import strategy_pattern.DiscountContext
import strategy_pattern.OverDiscountStrategy
import strategy_pattern.PrimeDiscountStrategy
import strategy_pattern.UserDiscountStrategy

class StrategyPatternTest {
    @Test
    fun strategyTest(){
        val totalPrice = 123f
        // 普通用户打95折
        var discountContext = DiscountContext(UserDiscountStrategy())
        println(discountContext.getDiscountPrice(totalPrice))

        // 满100减20
        discountContext = DiscountContext(OverDiscountStrategy())
        println(discountContext.getDiscountPrice(totalPrice))

        // 会员打85折
        discountContext = DiscountContext(PrimeDiscountStrategy())
        println(discountContext.getDiscountPrice(totalPrice))
    }
}