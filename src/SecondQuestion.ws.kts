// TODO: Écrire une fonction qui affiche les x premiers nombres de la suite Fibonacci

fun fibonacci(num: Int) {
    var a = 0
    var b = 1
    var c = 0
    for (i in 1..num) {
        c = a + b
        a = b
        b = c
        println("$a")
    }
}

fibonacci(num = 10)