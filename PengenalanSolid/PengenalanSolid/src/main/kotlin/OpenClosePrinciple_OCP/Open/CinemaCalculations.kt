package OpenClosePrinciple_OCP.Open

open class Cinema(val price: Double)
class StandardCinema(price: Double) : Cinema(price)
class DeluxeCinema(price: Double) : Cinema(price)
class PremiumCinema(price: Double) : Cinema(price)

class CinemaCalculations {
    fun calculateAdminFee(cinema: Cinema): Double {
        return if (cinema is StandardCinema) {
            cinema.price * 10 / 100
        }
        else if (cinema is DeluxeCinema) {
            cinema.price * 12 / 100
        }
        else if (cinema is PremiumCinema) {
            cinema.price * 20 / 100
        }
        else 0.0
    }
    abstract class Cinema(val price: Double) {
        abstract fun calculateAdminFee(): Double
    }

    class StandardCinema(price: Double) : Cinema(price) {
        override fun calculateAdminFee(): Double {
            return price * 10 / 100
        }
    }

    class DeluxeCinema(price: Double) : Cinema(price) {
        override fun calculateAdminFee(): Double {
            return price * 12 / 100
        }
    }

    class PremiumCinema(price: Double) : Cinema(price) {
        override fun calculateAdminFee(): Double {
            return price * 20 / 100
        }
    }
    class CoupleCinema(price: Double) : Cinema(price) {
        override fun calculateAdminFee(): Double {
            return price * 15 / 100
        }
    }

}

fun main() {
    val standardCinema = CinemaCalculations.StandardCinema(100.0)
    val adminFee = standardCinema.calculateAdminFee()
    print(adminFee)
}

