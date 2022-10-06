import DependencyInversionPrinciple_DIP.Car
import DependencyInversionPrinciple_DIP.EngineInterface

val electrons = Electrons()
val battery = Battery(electrons)
val speedController = SpeedController(BatteryManagementSystem(), ElectricMotor())
val electricEngine = ElectricEngine(speedController)
val electricCar = Car<Electrons>(electricEngine, battery)
electricCar.refill(electrons)
electricCar.accelerate()
electricCar.brake()

class ElectricEngine(
    private val speedController: SpeedController
) : EngineInterface {
    override fun move() {
        speedController.control()
    }
}

class SpeedController(
    private val bms: BatteryManagementSystem,
    private val motor: ElectricMotor
) {
    fun control() {
        val battery = bms.getBattery()
        motor.rotate(battery)
    }
}

class BatteryManagementSystem {
    fun getBattery(): Battery {
        return Battery(Electrons())
    }
}

class ElectricMotor {
    fun rotate(battery: Battery) {
        //Rotate the rotor using electric power from battery
    }
}

class Electrons {

}

class Battery(private var electrons: Electrons) : StorageInterface<Electrons> {
    override fun fill(source: Electrons) {
        this.electrons = source
    }

    override fun getSource(): Electrons {
        return electrons
    }

}