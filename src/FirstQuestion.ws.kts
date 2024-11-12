// TODO: Écrire une fonction qui affiche les x premiers nombres pairs ou impairs

fun displayEvenOrOddNumbers(x: Int, isEven: Boolean) {
    for (i in 0..x) {
        if (isEven) {
            val evenNumber = 2 * i
            println(evenNumber)
        } else {
            val oddNumber = 2 * i + 1
            println(oddNumber)
        }
    }
}

displayEvenOrOddNumbers(10, true)

displayEvenOrOddNumbers(5, false)