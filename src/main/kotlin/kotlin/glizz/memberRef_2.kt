/*
(x) lanjutan memberReferences (terlalu penuh)
(x) property references
(x) operator :: juga dapat digunakan untuk mereferensikan property
(x) dgn mereferensikan property kita dapat mengakses apa yg menjadi
bagian dari properti seperti nama, fungsi setter getter, dll
(x) terdapat 2 tipe objek, yaitu KMutableProperty dan KProperty
(x) KMutableProperty --> bersifat mutable yg memungkinkan kita untuk
menggunakan get(), set() dan properti name
(x) KProperty --> bersifat immutable sehingga hanya terdapat fungsi get()
 */

// mereferensikan property
val theName = "Maria Fidel"

fun main(){
    /*dgn menggunakan :: kita akan dapat mengakses bagian prop*/
    // mengakses prop
    val funName = ::theName.name // untuk mendapatkan nama dari prop
    val readName = ::theName.get() // untuk membaca nilai prop

    println(funName)
    println(readName)

    // set() --> berguna untuk menetapkan nilai
    /*::theName.set("Darren") --> error unresolved (dari dicoding hanya bgitu)

    val newName = theName.get()

    println(newName)*/
}