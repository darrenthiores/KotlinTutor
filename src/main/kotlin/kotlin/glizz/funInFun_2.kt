/*
(x) lanjutan funInFun.kt
(x) contoh kondisi inner function akan diperlukan
(x) inner function juga dapat dijadikan extension function
 */

/*
(x) code tanpa inner function
(x) code dibawah bekerja dgn baik tanpa error namun terdapat
banyak pengulangan yaitu pada penggunaan if, maka dari itu
kita pun dapat memanfaatkan inner function
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
   if (valueA == 0) {
       throw IllegalArgumentException("valueA must be better than 0")
   }

   if (valueB == 0) {
       throw IllegalArgumentException("valueB must be better than 0")
   }

   if (valueC == 0) {
       throw IllegalArgumentException("valueC must be better than 0")
   }

   return valueA + valueB + valueC
}
(*) fungsi throw IllegalArgumentException() belum dipelajari
 */

// code diatas tetapi menggunakan inner function
// code menjadi lebih singkat dan mudah dibaca
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

/*
(x) contoh inner function sbg extension function
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
   fun Int.validateNumber(){
       if (this == 0) {
           throw IllegalArgumentException("value must be better than 0")
       }
   }

   valueA.validateNumber()
   valueB.validateNumber()
   valueC.validateNumber()

   return valueA + valueB + valueC
}
 */

fun main(){
    println(sum(1, 2, 3))
}