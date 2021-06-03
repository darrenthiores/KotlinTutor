import java.lang.IllegalArgumentException

// latihan membuat function inside function

fun names(petName:String, gameName:String, itemName:String):String{
    fun String.validation(){
        if (this.length <= 5){
            throw IllegalArgumentException("Character must be more than 5")
        }
    }

    petName.validation()
    gameName.validation()
    itemName.validation()

    val stats = """
        Game Name : $gameName
        Pet Name : $petName
        Item Name : $itemName
    """.trimIndent()

    print(stats)

    return stats
}

fun main(){
    // pemanggilan fungsi

    // salah (akan muncul exception)
    /*names(
        gameName = "Heroes",
        petName = "Birde",
        itemName = "Maiden Sword"
    )*/

    // benar
    names(
        gameName = "Lordzz",
        petName = "Burung hantu",
        itemName = "Pedang udara"
    )
}