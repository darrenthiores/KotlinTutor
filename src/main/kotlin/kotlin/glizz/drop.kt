/*
(x) lanjutan fungsi pada collection
(x) fungsi drop() --> berguna untuk memangkas item dalam collection
berdasarkan jumlah yg ditentukan
(x) jumlah argumen pada fungsi drop adalah jumlah item yg akan dipangkas
(x) pemangkasan akan dimulai dari posisi pertama collection
(x) jika kita ingin memangkas item dari posisi terakhir, maka kita
dapat menggunakan fungsi dropLast()
 */

fun main(){
    // menggunakan fungsi drop()
    val randomList = listOf(1, 2, 3, 4, 5, 6, 7)
    val newList = randomList.drop(2) // memangkas 2 item terdepan

    println(newList)

    // menggunakan fungsi dropLast()
    val lastList = randomList.dropLast(2)

    println(lastList)
}