/*
Learning data types and variable in kotlin
(x) data types in kotlin :
- character
- string
- array
- numbers
- booleans
(x) variable --> untuk menyimpan nilai
(*) => pada kotlin, variable membutuhkan kata kunci var/val, identifier, type dan initialization
 */

// struktur variable pada kotlin : var/val identifier: Type = initialization
// contohnya :

fun main() {

    var name: String = "Fidel"

    print ("my name is ")
    println (name)

// penjelasan dari variable diatas
/*
(x) var dan val
keduanya memiliki fungsi yg sama yaitu untuk mengontrol nilai dari
sebuah variable, namun perbedaannya yaitu jika menggunakan var maka
nilai yg sudah di inisialisasi dapat diubah, sedangkan jika menggunakan
val maka nilai tidak dapat diubah atau akan terjadi error
 */
// contoh penggunaan var dan val
// (x) var
    println ("=============")

    var age: Number = 18
    age = 17

    print ("i am ")
    println (age)

// (x) val
    val tinggi: Number = 158.5
//  tinggi = 160 (*) error

    print ("my height is ")
    println (tinggi)
}

/*
(-) penjelasan lanjutan
(x) identifier --> merupakan nama dari suatu variable
pada program diatas contohnya yaitu name, age & tinggi
(x) type --> untuk menentukan tipe data dari suatu variable,
pada prgram diatas telah digunakan 2 yaitu String & Number
(*) --> tipe data tidak harus ditentukan karena kotlin mendukung
type inference
(x) initialization --> nilai awal dari suatu variable, pada program
diatas yaitu Fidel, 17, 158.5
 */