/*
(x) Tipe data character --> menggunakan Char
(x) untuk mendefinisikan tipe data char, menggunakan ('')/kutip tunggal
(x) tipe data Char hanya bisa digunakan untuk menyimpan tipe data tunggal
atau akan terjadi error jika lebi dari 1 karakter
 */

// penggunaan char

fun main() {
    var charExm = 'A'
//  val charExm_2 = 'ABC' --> error

    println (charExm)

/* keunikan tipe data char --> yaitu pada tipe data char bisa
dilakukan operasi increment (++) dan decrement (--) yang seharusnya
hanya bisa digunakan pada tipe data number
 */
// contoh nya
    println ("charExm " + charExm++)
    println ("charExm " + charExm++)
    println ("charExm " + charExm++)
    println ("charExm " + charExm--)
    println ("charExm " + charExm--)
/*
hal tsb terjadi karena pada dasarnya tiap karakter merupakan
representasi dari unicode
 */
}