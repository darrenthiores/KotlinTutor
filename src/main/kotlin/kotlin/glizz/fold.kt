/*
(x) kotlin collection menyediakan berbagai fungsi untuk memudahkan
mengelola dan memanipulasi data
(x) pada sub-modul sebelumnya bbrpa fungsi sudah dipelajari, yaitu
sum(), map(), sorted(), dll
(x) fungsi fold --> dgn menggunakan fungsi fold kita dapat melakukan
perhitungan setiap nilai dalam collection tanpa melakukan iterasi
(x) fungsi fold() memerlukan 2 argumen yaitu nilai awal untuk perhitungan
dan lambda expression yg nilai kembaliannya digunakan untuk menentukan
nilai awal selanjutnya
(x) didalam lambda expression terdapat 2 argumen, yaitu current sbg
nilai awal dan item sbg masing" item pada collection
(x) selain fungsi fold(), terdapat fungsi fold lain yaitu foldRight()
(x) fungsi foldRight() sama saja dgn fungsi fold(), namun bedanya
proses iterasi dimulai dari index terakhir dan posisi argumen
pada lambda expression berbeda
(x) posisi argumen fungsi foldRight() pada lambda expression adalah
item pada posisi pertama dan current pada posisi kedua
 */

fun main(){
    // contoh penggunaan fold
    val randomNum = listOf(3, 6, 2)
    val foldNum = randomNum.fold(0){ current, item ->
        println("current : $current")
        println("item : $item")
        println()
        current + 1
    }
    println("Fold result : $foldNum")

    println("===")

    // contoh penggunaan foldRight
    val rightFold = randomNum.foldRight(0){item, current ->
        println("current : $current")
        println("item : $item")
        println()
        current + item
    }
    println("fold right result : $rightFold")
}