// Inheritance atau yang biasa disebut dengan istilah pewarisan
// inheritance merupakan salah satu konsep penting Karena bisa meminimalisir penulisan berulang pada fungsi, properti, dan variable.
// Inheritance memungkinkan kita untuk mendefinisikan sebuah class (induk) ke class baru (anak) dan memberi kita kesempatan untuk
// menggunakan member dari class yang diwariskan tersebut. Inheritance dapat didefinisikan juga sebagai proses di mana suatu objek
// memperoleh sifat dan perilaku dari objek lainnya.
open class Superclass
// SuperClass adalah class yang fitur-fiturnya akan diwariskan. Kelas seperti ini biasa dikenal juga dengan
// istilah Induk, Base, atau Parent Class.

class SubClass:Superclass()
//SubClass adalah Anak/Children class yang akan mewarisi member milik Super Class. Namun,
//class ini tetap dapat memiliki membernya sendiri selain yang diwarisi dari SuperClass-nya.