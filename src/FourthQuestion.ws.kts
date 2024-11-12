// TODO: Écrire une fonction qui affiche les x premiers nombres premiers

fun displayPrimeNumbers(x: Int){

    var primeFound = mutableListOf<Int>()
    var currentNumber : Int = 0

    while (primeFound.size !== x){
        if (isPrime(currentNumber)){
            primeFound.add(currentNumber)
        }
        currentNumber++
    }

    println(primeFound)
}

fun isPrime(x: Int): Boolean {
    if (x <= 1) {
        return false
    }

    for (i in 2..(x%2)+1) {
        if (x % i == 0) {
            return false
        }
    }
    return true
}

displayPrimeNumbers(4)