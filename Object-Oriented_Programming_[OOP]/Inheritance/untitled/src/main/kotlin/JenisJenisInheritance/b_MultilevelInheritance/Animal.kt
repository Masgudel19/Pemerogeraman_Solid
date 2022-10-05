package JenisJenisInheritance.b_MultilevelInheritance

//multilevel inheritance. Cara ini mengacu pada mekanisme OOP, di mana SubClass dapat mewarisi
// SuperClass yang di mana merupakan sebuah SubClass dari SuperClass lain.
open class Animal {
    fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}

open class Carnivore: Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}

class Cat : Carnivore()