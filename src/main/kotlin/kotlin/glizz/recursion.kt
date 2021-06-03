/*
(x) recursion --> teknik dasar dalam pemrograman yg digunakan untuk
menyederhanakan pemecahan masalah yg kompleks
(x) pada kotlin recursion disebut dgn recursive function
(x) recursive function adalah sebuah teknik dimana fungsi akan
dipanggil/digunakan didalam fungsi itu sendiri
(x) setiap pemanggilan dapat diatur sehingga mengembalikkan nilai dan
nilai kembaliannya digunakan kembali sbg argumen untuk pemanggilan
fungsi berikutnya hingga mengembalikkan nilai akhir berupa perhitungan
nilai kembalian dari setiap pemanggilan funsgi
 */

/*
(x) contoh penggunaan recursion paling simple adalah faktorial
(x) code dibawah adalah tanpa menggunakan recursion
fun factorial(n: Int): Int {
   return if (n == 1) {
       n
   } else {
       var result = 1
       for (i in 1..n) {
           result *= i
       }
       result
   }
}
 */

// penggunaan recursion
fun factorial(n:Int): Int{
    return if (n==1){
        n
    }else{
        n * factorial(n-1) // pemanggilan fungsi didalam fungsi nya sendiri
    }
}

fun main(){
    // pemanggilan fungsi
    println(factorial(3))
}