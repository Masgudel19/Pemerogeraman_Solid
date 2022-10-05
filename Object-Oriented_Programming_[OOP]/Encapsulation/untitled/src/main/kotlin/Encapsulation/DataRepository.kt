package Encapsulation

// Encapsulation merupakan proses di mana sebuah penanganan data ditempatkan di dalam wadah tunggal yang disebut sebagai class. Saat menggunakan encapsulation,
// data dapat diisolasi dan tidak dapat diakses langsung dari luar. Dengan begini, kita cukup menggunakan data
// tersebut tanpa harus tahu bagaimana proses yang terjadi sampai data tersebut bisa digunakan.

class DataRepository {
    private val data = mutableListOf<Any>()

    fun setData(){
        val response = /* tons of logical code to retrieve data */
            data.clear()
        data.putAll(response.data)
    }

    fun getData() = data
}

// encapsulation bukan menyembunyikan sebuah data. Tetapi, encapsulation yang menyebabkan data tersebut tersembunyi.