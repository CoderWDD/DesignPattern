package fillter_pattern

class User: Filter {
    override fun meetCriteria(list: List<Ingredient>): List<Ingredient> {
        return list.filter {
            it.authorize is AuthorizeSealed.User
        }
    }
}