/*
(x) OOP (Object Oriented Programming)
(x) OOP merupakan sebuah paradigma pemrograman yg dimana berorientasi pd
objek
(x) OOP terdiri dari object, classes, attribute dan behaviour
(x) objek merupakan hasil realisasi dari sebuah blueprint atau class yg
artinya memiliki fungsi dan prop yg sama dgn blueprint nya
(x) pada kotlin, nilai primitif merupakan object berbeda dgn bhs
pemrograman lain. oleh karena itu pd kotlin dikenal dgn
istilah Object Everywhere
 */

fun main(){
    // contoh objek
    /* variable dibwah merupakan sebuah objek yg mana merupakan
    realisasi dari kelas String, maka dari itu objek dibawah akan
    memiliki fungsi dan prop dari class String*/
    val text = "Hello World!!"

    // pembuktian jika variable diatas merupakan realisasi dari class String
    val reversedText = text.reversed() // membuat urutan huruf terbalik
    val upText = text.toUpperCase() // membuat semua huruf menjadi huruf kapital
    val lowText = text.toLowerCase() // membuat semua huruf menjadi huruf kecil

    println(text)
    println(reversedText)
    println(upText)
    println(lowText)

    // kita jg dpat mengubah tipe data dgn mengakses fungsi yg tersedia
    val numText = "111"
    val integerNum = numText.toInt()

    println(integerNum is Int)
}