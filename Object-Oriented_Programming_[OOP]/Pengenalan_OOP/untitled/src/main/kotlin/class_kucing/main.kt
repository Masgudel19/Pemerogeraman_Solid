package class_kucing

import class_kucing.Kucing

// Pada dasarnya Instance dan Object adalah hal yang sama.
// Karena sebuah object adalah instance dari sebuah class yang kita buat,
// atau singkatnya adalah objek yang merupakan hasil realisasi dari sebuah blueprint.
// Object yang terbentuk dari sebuah class akan memiliki hak akses terhadap keseluruhan isi class.

fun main(){
    val persian = Kucing()
    persian.color = "Putih"
    persian.height = 24.0
    persian.length = 46.0
    persian.weight = 2.0

    val bengal = Kucing("coklat",22.0,39.9,2.3)
    val anggora = Kucing("Abu-abu",25.0,41.0,2.4)

    println(bengal)
    println(anggora)
    println(persian)
}