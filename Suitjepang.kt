class Suitjepang (game: String = "Suit Jepang") : Suit(game){
fun startGame() {
print("Username : ")
val Username = readLine()
    println("Good Luck, $Username :) ")
print(" Siapa Selanjutnya: ")
val Usernamedua = readLine()

    print(" $Username Udah tau mainnya kan??, Pilih apa nih??:  ")
    val Usernamechoice1 = readLine()

print(" Pemain 2 $Usernamedua Pilih apa nih??: ")
    val Usernamechoice2 = readLine()

    if (Usernamechoice1 == "Batu" && Usernamechoice2 == "Batu") {
println("Seri")
    }
    else if (Usernamechoice1 == "Batu" && Usernamechoice2 == "Kertas")
        println("$Username kalah")
    else if (Usernamechoice1 == "Batu" && Usernamechoice2 == "Gunting")
        println("$Username menang")
    else if (Usernamechoice1 == "Gunting" && Usernamechoice2 == "Kertas")
        println("$Username menang")
    else if (Usernamechoice1 == "Gunting" && Usernamechoice2 == "Gunting")
        println("Seri")
    else if (Usernamechoice1 == "Gunting" && Usernamechoice2 == "Batu")
        println("$Username kalah")
    else if (Usernamechoice1 == "Kertas" && Usernamechoice2 == "Kertas")
        println("seri")
    else if (Usernamechoice1 == "Kertas" && Usernamechoice2 == "Gunting")
        println("$Username kalah")
    else if (Usernamechoice1 == "Kertas" && Usernamechoice2 == "Batu")
        println("$Username menang")
    restartGame()
}
    override fun restartGame() {
        print("Mau main lagi? (Iya Atau Tidak) ")
        val shouldRestart = readLine();
        if (shouldRestart == "y") {
            startGame();

        } else {
            println("==================================")
            println("Thank You Gaiss!!!:)")
            println("==================================")
        }
    }
}