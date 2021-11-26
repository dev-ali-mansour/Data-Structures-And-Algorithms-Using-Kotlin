package big_o

// What is the Big O of the below function? (Hint, you may want to go line by line)
fun anotherFunChallenge(input: Array<Any>) {
    val a = 5 // O(1)
    val b = 10 // O(1)
    val c = 50 // O(1)
    for (i in input.indices) { // O(n)
        val x = i + 1 // O(n)
        val y = i + 2 // O(n)
        val z = i + 3 // O(n)
    }
    for (j in input.indices) { // O(n)
        val p = j * 2 // O(n)
        val q = j * 2 // O(n)
    }
    val whoAmI = "I don't know" // O(1)
}
// O(4 + 7n) --> O(n)