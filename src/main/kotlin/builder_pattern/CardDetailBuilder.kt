package builder_pattern

class CardDetailBuilder(override val ImageUrl: String, override val User: String, private var Description: String = ""): Builder(
    ImageUrl = ImageUrl,
    User = User
) {
    override fun build(): Builder {
        return this
    }

    override fun setDescription(description: String): Builder = apply {
        Description = description
    }

    override fun toString(): String {
        return "imageUrl: $ImageUrl , user: $User , description: $Description"
    }
}