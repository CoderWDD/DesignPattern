package fillter_pattern

class Ingredient constructor(val authorize: AuthorizeSealed){
    override fun toString(): String {
        return authorize.toString()
    }
}

sealed class AuthorizeSealed{
    object User: AuthorizeSealed()
    object Admin: AuthorizeSealed()
    object SuperAdmin: AuthorizeSealed()
}