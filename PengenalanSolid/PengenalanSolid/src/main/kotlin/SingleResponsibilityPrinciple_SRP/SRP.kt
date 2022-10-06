package SingleResponsibilityPrinciple_SRP

class Order {
    fun calculateTotalSum() {}
    fun getItems() {}
    fun getItemCount() {}
    fun addItem(item: Item) {}
    fun deleteItem(item: Item) {}
}

class Item
class OrderHistory {
    fun getDailyHistory() {}
    fun getMonthlyHistory() {}
}

class OrderViewer {
    fun printOrder(order: Order) {}
    fun showOrder(order: Order) {}
}

// function addItem() untuk menambahkan item
// function deleteItem() untuk menghapus item
// function getItems() untuk mendapatkan seluruh items yang telah ditambahkan
// function getItemCount() untuk mendapatkan jumlah item
// function calculateTotalSum() untuk perhitungan penjumlahan total item

fun main() {
    val order = Order()
    order.addItem(Item())
    val repository = OrderHistory()
    repository.getMonthlyHistory()
    val viewer = OrderViewer()
    viewer.printOrder(order)
}


