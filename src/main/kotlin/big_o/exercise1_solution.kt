package big_o

fun anotherFunction() {}

// What is the Big O of the below function? (Hint, you may want to go line by line)
fun funChallenge(input: Array<Any>): Int {
    var a = 10 // O(1)
    a = 50 + 3 // O(1)

    for (i in input.indices) { // O(n)
        anotherFunction() // O(n)
        var stranger = true // O(n)
        a++ // O(n)
    }
    return a // O(1)
}
// O(3 + 4n) --> O(n)