package d.GeneralizationdanSpecialization

abstract class Product(
    private var id: String,
    private var name: String,
    private var price: String
)

class ElectronicProduct(
    private var id: String,
    private var name: String,
    private var price: String,
    private var productionDate: String
) : Product(id, name, price)

class ConsumableProduct(
    private var id: String,
    private var name: String,
    private var price: String,
    private var expirationDate: String
) : Product(id, name, price)