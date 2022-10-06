package DependencyInversionPrinciple_DIP

class PetrolEngine : EngineInterface {
    override fun start() {}
}

class HybridEngine: EngineInterface {
    override fun start() {}
}

class DieselEngine : EngineInterface {
    override fun start() {}
}
class Engine {
    fun start() {}
}

interface EngineInterface {
    fun start()
}

class Car(private val engine: EngineInterface) {
    fun start() {
        engine.start()
    }
}

fun main() {
    val petrolEngine = PetrolEngine()
    val petrolCar = Car(petrolEngine)
    val dieselEngine = DieselEngine()
    val dieselCar = Car(dieselEngine)
    val hybridEngine = HybridEngine()
    val hybridCar = Car(hybridEngine)

    //Booom boom
    petrolCar.start()
    dieselCar.start()
    hybridCar.start()
}