// TODO: Écrire une fonction qui calcule le factoriel d’un nombre x, utiliser 10 par défaut si aucun nombre n’est spécifié.

fun factorial(x: Int = 10): Long {
    if (x < 0) {
        println("Erreur, x doit être supérieur à 0 !")
    }
    if (x == 0) {
        return 1
    }
    var result = 1L
    for (i in 2..x) {
        result *= i
    }
    return result
}

println(factorial(3))
