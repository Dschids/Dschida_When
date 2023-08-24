fun main(args: Array<String>) {
// asks user for a number between 1 and 10, then tells the user what that number is in German
// intialize variables
var usernum = 1
var inGerman = "x"
var cont = "y"
    // run while loop until user enters n to stop
    // changes
while (cont != "n") {
    print("Enter a number for the German translation: ")
    usernum = readln()!!.toInt()
    // when statement changes ingerman variable depending on number entered
    when (usernum){
        1 -> inGerman = "Einz"
        2 -> inGerman = "Zwei"
        3 -> inGerman = "Drei"
        4 -> inGerman = "Vier"
        5 -> inGerman = "Funf"
        6 -> inGerman = "Sechs"
        7 -> inGerman = "Sieben"
        8 -> inGerman = "Acht"
        9 -> inGerman = "Nuen"
        10 -> inGerman = "Zehn"
        !in 1..10 -> inGerman = "Out of Range"
        else -> inGerman = "Unknown"
    }
    println("$usernum in German is $inGerman") // print number entered and german version
    print("Would you like to enter another number? y/n: ")
    cont = readln()!!.toString() //update loop flag with user response
}
}