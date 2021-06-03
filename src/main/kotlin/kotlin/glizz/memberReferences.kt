/*
(x) member references -> function references, property references
(x) kita dapat memisahkan lamda menjadi fungsi tersendiri dan
mereferensikannya sbg instance dari function type
(x) dpat disimpulkan pada lambda dibawah fungsi berguna
sbg expression yg mana expression didalam fungsi menjadi
expression lambda
(*) perbedaan lambda dibawah dapat dilihat dgn membandingkan
code dibawah dgn code di file high-order.kt
(x) function references
(x) dgn soperator :: kita bisa menjadikan sebuah fungsi sbg
instances dari function type
(x) kita juga dapat mereferensikan sebuah extensions function
dgn cara menyertakan objek yg menjadi receiver sebelum operator ::
 */

// memisahkan lambda dan mereferensikannya
fun fullName(first:String, last:String):String{
    val printName = "name : $first $last"
    println(printName)
    return printName
}

// membuat lambda
val nameGenerate: (String, String) -> String = ::fullName

// mereferensikan sebuah fungsi
// membuat fungsi untuk memfilter data (sbg contoh)
// fungsi dibawah berguna untuk mencari angka ganjil
fun oddFilter(num:Int) = num%2 != 0

// mereferensikan extension function
fun Int.evenFilter() = this%2 == 0

/*
Kode di atas ditulis dengan mekanisme Reflection yang berarti
seperangkat fitur bahasa dan library yang memungkinkan kita untuk
mengamati struktur kode dari proyek yang sedang kita
kerjakan secara langsung.
 */

fun main(){
    // memanggil lambda
    nameGenerate("Maria", "Fidel")

    // contoh pemanggilan function references
    val data = 1..10
    val oddNum = data.filter(::oddFilter)

    println(oddNum)

    // pemanggilan extension function references
    val newData = 10..20
    val evenNum = newData.filter(Int::evenFilter)

    println(evenNum)
}