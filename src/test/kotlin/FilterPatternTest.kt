import fillter_pattern.*
import org.testng.annotations.Test

class FilterPatternTest {
    @Test
    fun filterTest(){
        val list = mutableListOf<Ingredient>()
        list.add(Ingredient(AuthorizeSealed.User))
        list.add(Ingredient(AuthorizeSealed.Admin))
        list.add(Ingredient(AuthorizeSealed.SuperAdmin))
        val userFilter = User()
        println(userFilter.meetCriteria(list))
        val adminFilter = Admin()
        println(adminFilter.meetCriteria(list))
        val superAdminFilter = SuperAdmin()
        println(superAdminFilter.meetCriteria(list))
    }
}