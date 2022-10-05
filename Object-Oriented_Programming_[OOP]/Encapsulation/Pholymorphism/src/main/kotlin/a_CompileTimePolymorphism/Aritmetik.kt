package a_CompileTimePolymorphism

// Compile time polymorphism adalah sebuah proses di mana sebuah method atau fungsi dipanggil saat kompilasi.
// Ini dapat terjadi karena sebuah konsep bernama method overloading. Method overloading merupakan kondisi
// di mana kita bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, atau urutan parameter yang
// berbeda di dalam sebuah class.
open class Aritmetik {
    open fun add(valueA: Int, valueB: Int) = valueA + valueB
    fun add(valueA: Long, valueB: Long) = valueA + valueB
    fun add(valueA: Int, valueB: Long) = valueA + valueB
    fun add(valueA: Long, valueB: Int) = valueA + valueB
}

// Method overloading di atas dibedakan atas tipe argumen yang menjadi parameter dari fungsi tersebut.

class Add: Aritmetik (){
    override fun add (valueA: Int,valueB: Int):Int{
        println("calculate!")
        return super.add(valueA, valueB)
    }
}

