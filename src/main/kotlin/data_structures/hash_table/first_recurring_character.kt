package data_structures.hash_table

fun main() {
    println(getFirstRecurringCharacter(intArrayOf(2, 5, 1, 2, 3, 5, 1, 2, 4)))
    println(getFirstRecurringCharacter(intArrayOf()))
    println(getFirstRecurringCharacter2(intArrayOf(2, 5, 1, 2, 3, 5, 1, 2, 4)))
    println(getFirstRecurringCharacter2(intArrayOf()))
}

fun getFirstRecurringCharacter(input: IntArray): Int? {
    for (i in input.indices) {
        for (j in i + 1 until input.size) {
            if (input[i] == input[j]) return input[i]
        }
    }
    return null
} // O(n^2)

fun getFirstRecurringCharacter2(input: IntArray): Int? {
    val hashset = HashSet<Int>()
    for (element in input) {
        if (hashset.contains(element)) return element
        hashset.add(element)
    }
    return null
} // O(n)