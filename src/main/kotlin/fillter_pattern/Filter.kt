package fillter_pattern

interface Filter {
    fun meetCriteria(list: List<Ingredient>): List<Ingredient>
}