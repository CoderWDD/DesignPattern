package fillter_pattern

class SuperAdmin: Filter {
    override fun meetCriteria(list: List<Ingredient>): List<Ingredient> {
        return list.filter {
            it.authorize is AuthorizeSealed.SuperAdmin
        }    }
}