/*
(x) lanjutan fungsi pada collection
(x) fungsi take() --> berbeda dgn fungsi drop() yg berguna untuk
memangkas item, fungsi take() berguna untuk mengambil item berdasarkan
jumlah yg diinginkan
(x) pemanggilan fungsi take() sama dgn fungsi drop() dimana kita perlu
menentukan jumlah item yg ingin diambil
(x) jika ingin mengambil item dari posisi terakhir maka sama halnya
dgn fungsi dropLast(), kita dapat menggunakan fungsi takeLast()
 */

fun main(){
    // penggunaan fungsi take()
    val randomList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val takeList = randomList.take(5)

    println(takeList)

    // penggunaan fungsi takeLast()
    val lastTake = randomList.takeLast(5)

    println(lastTake)
}