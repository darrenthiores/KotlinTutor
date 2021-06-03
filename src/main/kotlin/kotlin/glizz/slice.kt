/*
(x) lanjutan fungsi pada collection
(x) fungsi slice() --> jika fungsi take() berguna untuk mengambil item
dari index pertama atau terakhir, maka fungsi slice() berguna untuk
mengambil item dgn index yg kita tentukan
(x) fungsi slice() akan membutuhkan argumen range, yaitu posisi pertama
dan terakhir item yg ingin diambil
(*) reminder! item pada fungsi list dimulai dari index 0
(x) karena argumen pada fungsi slice() berupa range, maka
kita dapat menggunakan operator step
(x) jika kita ingin mengambil item dgn posisi yg lebih spesifik, maka
kita dapat melakukanny dgn mendefinisikan sebuah collection dan
menjadikan collection tsb sbg argumen
(*) berhati" dalam menentukan cakupan index karena jika posisi
tidak terdapat dalam collection maka akan terjadi
ArrayIndexOutOfBoundsException
 */

fun main(){
    // penggunaan fungsi slice
    val randomList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // mengambil item dari index 2-5
    val randomSlice = randomList.slice(2..5)

    println(randomSlice)

    // menggunakan fungsi slice() dan operator step
    val newSlice = randomList.slice(2..5 step 2)

    println(newSlice)

    // menggunakan fungsi slice() dgn lebih spesific
    // mengambil item scr acak dgn spesific
    val specList = listOf(1, 4, 5, 2, 9)
    val specSlice = randomList.slice(specList)

    println(specSlice)
}