package JenisJenisInheritance.d_HIerachicalInheritance

// Sama seperti penerapan inheritance pada umumnya, jenis ini merupakan sebuah SuperClass yang diwarisi oleh beberapa SubClass.
open class Animal {
    fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}

open class Carnivora:Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}

class Cat: Carnivora()