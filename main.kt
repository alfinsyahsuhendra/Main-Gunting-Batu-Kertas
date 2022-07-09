private val gameSuit = arrayListOf<String>("Hopimpa", "Suit Jepang", "Suit Standar")
fun main(){
    initiazeGame()
    print("Pilihan: ")
    val pilihan = readLine() ?: "0"
    chooseGame(pilihan)
}
fun initiazeGame(){
    println("==========================")
    println("GAMETERMINAL VERSION")
    println("==========================")
    println("Pilih Game:")

    for((index, suit) in gameSuit.withIndex()){
        println((index+1).toString()+".  "+suit)

    }
}
fun chooseGame(pilihan: String = "0"){
    when(pilihan.lowercase()){

        "2", "Suit Jepang" -> {
            val suitjepang = Suitjepang(gameSuit[1])
            suitjepang.startGame()
        }
        else -> {
            println("Game sedang tahap pengembangan.")
        }
    }
}