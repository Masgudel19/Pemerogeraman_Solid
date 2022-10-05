package b_AssociationAggregationdanComposition.Association1

class seller (
    private val id: String,
    private val name:String
)

class User(
    private val id: String,
    private val name:String,
    private val sellers:List<seller>
)
