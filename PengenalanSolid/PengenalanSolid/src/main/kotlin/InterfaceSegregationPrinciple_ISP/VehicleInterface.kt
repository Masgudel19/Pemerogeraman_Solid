package InterfaceSegregationPrinciple_ISP

interface VehicleInterface {
    fun drive()
    fun stop()
    fun refuel()
    fun openDoors()
}


class Motorcycle : VehicleInterface {
    // Can be implemented
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}


    //Pain point
    // Can not be implemented
    override fun openDoors() {}

    interface DoorInterface {
        fun openDoors()
    }

    class Car : VehicleInterface, DoorInterface {
        override fun drive() {}
        override fun stop() {}
        override fun refuel() {}
        override fun openDoors() {}
    }
}

// Dengan memisahkan interface menjadi bagian-bagian kecil, kegunaan dan tanggung jawab dari interface tersebut
// akan mudah dipahami oleh developer. Tujuannya adalah untuk menghasilkan desain yang fleksibel, dengan cukup
// mengimplementasikan interface tertentu daripada mengimplementasikan satu interface yang di dalamnya terdiri
// dari banyak function yang lebih kompleks.