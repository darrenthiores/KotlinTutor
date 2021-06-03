/*
(x) lanjutan fungsi pada collection
(x) fungsi distinct --> untuk menghilangkan duplikasi
(x) selain untuk menghilangkan duplikasi pada param tipe data number,
kita juga dapat menggunakan fungsi distinct terhadap parameter
seperti data class
(x) untuk menghilangkan duplikasi pada tipe data class kita
menggunakan fungsi distinctBy()
(x) kita dapat menentukan proses penghilangan item duplikasi
dgn fungsi distinctBy()
(x) fungsi distinct() tidak dapat digunakan pada map collection
 */

fun main(){
    // menggunakan fungsi distinct()
    val randomList = listOf(1, 1, 2, 3, 4, 4, 5, 3, 2, 1, 5, 6, 7, 7)
    val newList = randomList.distinct()

    println(newList)

    // menggunakan fungsi distinct() terhadap parameter data class
    data class nameList(val key:String, val name:String)

    val theList = listOf(
        nameList("1", "Maria Fidel"),
        nameList("1", "Jovan"),
        nameList("2", "Maria Fidel"),
        nameList("2", "Darren Thiores"),
        nameList("3", "John")
    )

    // menghilangkan duplikasi berdasarkan value
    val distinctMore = theList.distinctBy { it.name }

    distinctMore.forEach{
        println("${it.key}. ${it.name}")
    }

    // menghilangkan duplikasi berdasarkan key
    val distinctName = distinctMore.distinctBy { it.key }

    distinctName.forEach{
        println("${it.key}. ${it.name}")
    }

    // contoh menentukan proses penyaringan item
    // menyaring item dgn panjang sama
    val randomText = listOf("A", "B", "CC", "DDD", "EEE")
    val distinctText = randomText.distinctBy { it.length }

    println(distinctText)

    // contoh lain menghilangkan duplikasi tipe data string
    val randomWord = listOf("dogi", "kunci", "kucing", "dogi", "kunci")
    val newWord = randomWord.distinct()

    println(newWord)
}