// trying

val multiply:(Int, Int) -> Int = {valueA, valueB -> valueA * valueB}

fun result(valueA:Int, valueB:Int, multiply:(Int, Int)->Int){
    val res = multiply(valueA, valueB)
    println(res)
}

fun main(){
    result(10, 10, multiply)

    // cara lain (bukan higher-order function)
    val res = multiply(5, 10)
    println(res)
}