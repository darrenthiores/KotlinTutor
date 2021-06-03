/*
(x) lanjutan fungsi pada collection
(x) fungsi chunked() --> berguna untuk memecah nilai string menjadi
beberapa bagian kecil dalam bentuk array
(x) fungsi chunked() berfungsi sama dgn fungsi split(), namun
berbeda pada penerapannya
(x) fungsi split() membutuhkan argumen berupa RegEx sbg param,
sedangkan fungsi chunked() menggunkan argumen nilai sbg jumlah index
untuk pemisah
(x) pada fungsi chunked(), nilai string akan terpisah setiap
nilai yg dimasukkan pada argumen
(x) selain berfungsi untuk memecah string, fungsi chunked() juga
dapat digunakan untuk memodifikasi setiap nilai yg sudah dipecah
(x) argumen it didalam lambda expression pada code dibawah merupakan
representasi dari setiap nilai yg sudah dipecah
 */

fun main(){
    // penggunaan fungsi chunked()
    val word = "helloworld!!"

    // memecah string setiap 5 huruf
    val chunkedWord = word.chunked(5)

    println(chunkedWord)

    // contoh memodifikasi nilai yg sudah dipecah
    // membuat nilai menjadi huruf kapital
    val newChunked = word.chunked(3) {
        it.toString().toUpperCase()
    }

    println(newChunked)
}

/*
(x) fungsi yg belum dipelajari namun tau penggunaannya
(x) toLowerCase() --> membuat huruf menjadi huruf kecil
(x) toUpperCase() --> membuat huruf menjadi huruf kapital
 */