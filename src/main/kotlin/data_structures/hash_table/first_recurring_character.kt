package data_structures.hash_table

fun main() {
    println(getFirstRecurringCharacter(intArrayOf(2, 5, 1, 2, 3, 5, 1, 2, 4)))
    println(getFirstRecurringCharacter(intArrayOf(2, 1, 1, 2, 3, 5, 1, 2, 4)))
    println(getFirstRecurringCharacter(intArrayOf()))
    println(getFirstRecurringCharacterOptimized(intArrayOf(2, 5, 1, 2, 3, 5, 1, 2, 4)))
    println(getFirstRecurringCharacterOptimized(intArrayOf(2, 1, 1, 2, 3, 5, 1, 2, 4)))
    println(getFirstRecurringCharacterOptimized(intArrayOf()))
}

fun getFirstRecurringCharacter(input: IntArray): Int? {
    for (i in input.indices) {
        for (j in i + 1 until input.size) {
            if (input[i] == input[j]) return input[i]
        }
    }
    return null
} // O(n^2)

fun getFirstRecurringCharacterOptimized(input: IntArray): Int? {
    val map = hashMapOf<Int, Int>()
    for (i in input.indices) {
        if (map.contains(input[i])) return input[i]
        map[input[i]] = i
    }
    return null
} // O(n)