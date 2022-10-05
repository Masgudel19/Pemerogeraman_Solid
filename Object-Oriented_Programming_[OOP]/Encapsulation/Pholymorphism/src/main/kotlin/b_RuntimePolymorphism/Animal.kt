package b_RuntimePolymorphism

// runtime polymorphism adalah proses di mana sebuah fungsi dipanggil pada saat runtime. Contoh dari runtime
// polymorphism adalah method overriding, yaitu sebuah kelas yang memiliki fungsi dengan nama sama dengan fungsi
// yang di dalam kelas induknya.

// method overriding adalah sebuah fitur pada sebuah bahasa pemrograman yang memungkinan sub class mewarisi
// sebuah implementasi yang spesifik dari sebuah fungsi yang ada pada kelas induknya (parent class).
// Implementasi pada sub class akan menimpa atau mengganti implementasi pada parent class
fun main(){
    val cat = Cat()
    cat.walk()
}

open class Animal {
    open fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}

class Cat: Animal(){
    override fun walk() {
        super.walk()
        println("yeay! ${javaClass.simpleName} walked!")
    }
}