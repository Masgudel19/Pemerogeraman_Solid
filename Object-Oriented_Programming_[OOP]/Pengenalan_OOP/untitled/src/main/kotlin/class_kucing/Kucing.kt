package class_kucing


// class merupakan sebuah blueprint. Di dalam class ini kita mendefinisikan sesuatu yang merupakan atribut ataupun behaviour.

data class Kucing(
    var color: String = "",
    var height: Double = 0.0,
    var length: Double = 0.0,
    var weight: Double = 0.0
)
