/*
(x) String --> merupakan tipe data yang terdiri dari beberapa karakter
(x) untuk membuat string diperlukan tanda kutip ("")
(x) pada dasarnya string merupakan sebuah array sehingga memungkinkan untuk
melakukan indexing untuk mendapat karakter tunggal
(*) --> indexing merupakan cara untuk mengakses elemen dalam sebuah collection dgn
memanfaatkan index yg dimuali dari 0
(x) objek string dapat dilakukan iterasi for-loop
(x) pada kotlin terdapat escaped string --> berfungsi untuk mengurangi
ambiguitas nilai pada string (contohnya penggunaan tanda petik dalam string)
, untuk mengatasi nya kita dapat menggunakan escaped string yaitu dgn
memberi backslash(\) sebelum tanda petik
(x) selain tanda (\), ada beberapa karakter yg dpat digunakan, yaitu :
- \t --> menambahkan tab
- \n --> membuat baris baru
- \' --> menambahkan karakter single quote
- \" --> menambahkan karakter double quote
- \\ --> menambahkan backslash (\)
(x) kita dapat memasukkan unicode kedalam string
(x) pada kotlin terdapat raw string, yg memungkinkan untuk menulis multiline
dan arbitrary text yg mana biasanya menggunakan (\n) namun dgn raw string
dapat dilakukan dgn lebih mudah
(x) untuk membuat raw string menggunakan 3 tanda petik (""" """)
 */

// contoh

fun main() {
    val sick = "Maag" // merupakan sebuah string

    // bukti string merupakan array
    val sickFirstChar = sick[0]

    println ("yaya sickness is $sick")
    println ("and the first character of her sickness is $sickFirstChar")

    // penggunaan escaped string
//  val boo = "yaya is "yaya"" --> hasilnya error
    val boo = "yaya is \"yaya\""

    println (boo)

    // penggunaan unicode pada string
    val contohUnicode = "\u00A9"

    println ("the unicodec : $contohUnicode")

    // penggunaan raw string
    val rank = """
        first (1)
        second (2)
        third (3)
    """.trimIndent()

    print (rank)
}