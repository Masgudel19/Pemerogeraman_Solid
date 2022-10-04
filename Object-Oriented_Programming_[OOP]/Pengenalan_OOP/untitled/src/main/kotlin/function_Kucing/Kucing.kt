package function_Kucing

// Function atau fungsi merupakan sebuah prosedur yang memiliki keterkaitan dengan pesan dan objek.
// Ketika kita memanggil sebuah fungsi maka sebuah mini-program akan dijalankan.
// Fungsi sendiri bisa diartikan sebagai cara sederhana untuk mengatur program buatan kita.

class Kucing (
    var color:String,
    var height:Double,
    var length:Double,
    var weight:Double
    ){

    fun purring(){
        println("Meow ..")
    }

    fun eat(){
        weight += 1
    }
}