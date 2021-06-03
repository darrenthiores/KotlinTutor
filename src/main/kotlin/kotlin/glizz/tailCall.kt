/*
(x) lanjutan recursion
(x) ketika kita menjalankan fungsi pada file sebelumnya (recursion.kt)
program akan menciptakan tumpukan frame dgn jumlah berdasarkan nilai n
yg mana setiap frame akan mengkonsumsi memori
(x) banyaknya frame dapat menjadi masalah didalam penerapannya, dimana
jika nilai yg dimasukkan terlalu besar maka akan terjadi error
(x) untuk mengatasi masalah diatas, kotlin mendukung tail recursion
(x) tail recursion --> sekumpulan urutan intruksi untuk menjalankan
tugas tertentu yg dijalankan terakhir pada sebuah prosedur
(x) dgn menggunakan tail recursion kita dapat meminimalisir penumpukan
frame ketika menerapkan recursive
(x) tail recursion akan memastikan proses sebelumnya selesai
sebelum pemanggilan fungsi berikutnya
(x) scr default JVM tidak mendukung optimasi tail recursion, maka
dari itu kotlin menyediakan modifier tailrec sehingga kita bisa
menerapkan tail recursion
(x) penggunaan modifier tailrec adalah dgn menempatkannya sebelum
kata lunci fun
(x) ketika sebuah fungsi ditandai dgn modifier tailrec, fungsi tsb
hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh
digunakan dari dalam blok try-catch-finally
(*) blok try-catch-finally belum dipelajari
 */

// penggunaan tailrec dan menerapkan tail recursion pada kode tadi
tailrec fun factorial(n:Int, result:Int = 1): Int{
    val lastResult = n * result // proses yg akan dipastikan selesai
    return if (n==1){
        lastResult
    }else{
        factorial(n-1, lastResult)
    }
}

fun main(){
    println(factorial(4))
}

/*
(x) penjelasan code diatas
--> lastResult akan menjadi hasil dari faktorial ketika n sudah
merupakan 1
--> ketika n belum atau tidak bernilai 1, maka fungsi akan dijalankan
dgn nilai lastResult sbg argumen result
 */