package JenisJenisInheritance.a_SingleInheritance

//Single Inheritance adalah cara terumum yang mana class yang dibuat hanya mewarisi satu class.
open class Animal {
    open fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}

class Cat : Animal(){
    override fun walk() {
        println("Yeay! ${javaClass.simpleName} walked!")
    }
}