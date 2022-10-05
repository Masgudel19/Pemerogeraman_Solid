package JenisJenisInheritance.c_MultipleInheritance

import JenisJenisInheritance.c_MultipleInheritance.Snake as Snake1

// multiple inheritance mengacu pada konsep OOP di mana sebuah class dapat mewarisi lebih dari satu SuperClass.

interface Ovipar
interface Vivipar

interface Ovovivipar:Ovipar,Vivipar

class Snake:Ovovivipar

// Multiple inheritance sendiri sangat jarang digunakan dalam pengembangan perangkatlunak karena sering
// menyebabkan permasalahan, terutama padahirarki class yang berpotensi menyebabkan terjadinya kompleksitas tinggi.