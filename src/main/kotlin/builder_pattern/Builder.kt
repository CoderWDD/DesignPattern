package builder_pattern

// ImageUrl、User 为必须参数
abstract class Builder(open val ImageUrl: String, open val User: String) {
    abstract fun build(): Builder
    abstract fun setDescription(description: String): Builder
}