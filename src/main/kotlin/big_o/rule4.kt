package big_o

// Rule 4: Drop Non dominates
fun printAllNumbersThenAllPairSums(numbers: Array<Int>) {
    println("These are numbers:")
    numbers.forEach { println(it) }

    println("And these are their sums:")
    numbers.forEach { firstNumber ->
        numbers.forEach { secondNumber ->
            println(firstNumber + secondNumber)
        }
    }
} // O(n + n^2) --> O(n^2)