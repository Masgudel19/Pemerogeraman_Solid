package b_AssociationAggregationdanComposition.Composition1

fun main() {
    val user = User(id = "1234", name = "Khrisna", address = Address("123", "Bandung"))
}

class User(
    private val id: String,
    private val name: String,
    private val address: Address
)

class Address(
    private val id: String,
    private val location: String
)