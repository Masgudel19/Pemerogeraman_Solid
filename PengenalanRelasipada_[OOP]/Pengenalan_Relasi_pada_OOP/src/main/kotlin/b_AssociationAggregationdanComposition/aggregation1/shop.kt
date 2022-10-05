package b_AssociationAggregationdanComposition.aggregation1

class Shop(
    private val id: String,
    private val name: String
) {
    var seller: Seller
        set(value) {
            seller = value
        }
        get() {
            return seller
        }

}

class Seller(
    private val id: String,
    private val name: String
)