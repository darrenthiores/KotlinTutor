/*
(x) function inside function
(x) terkadang ketika membuat sebuah fungsi dgn tujuan code menjadi
lebih terstruktur dan mudah dibaca, justru code malah menjadi lebih
panjang atau susah dibaca
(x) permasalahan diatas dapat ditangani dgn menggunakan fungsi lokal atau
inner function yg disebut sbg function inside function
(x) inner function hanya memmiliki hak akses terbatas pada fungsi
terluarnya
(x) inner function dapat mengakses apa yg menjadi bagian fungsi terluarnya
(*) inner function hanya dapat diakses detelah fungsi didefinisikan, jika
diakses sebelum didefinisikan maka akan terjadi error
 */

// contoh inner function
fun greets(message:String){
    fun greetings(text:String){
        println(text)
    }
    greetings(message)
}

// bukti inner function dapat mengakses fungsi luarnya
fun myName(first:String, last:String){
    fun greets(){
        println("Hello!! my name is $first $last")
    }
    greets()
}

fun main(){
    // pemanggilan fungsi
    greets("Hello!")

    // pemanggilan fungsi ke-2
    myName("Darren", "Thiores")
}