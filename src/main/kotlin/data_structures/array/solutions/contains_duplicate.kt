package data_structures.array.solutions

fun containsDuplicate(nums: IntArray): Boolean {
    var arr = mutableSetOf<Int>()
    nums.forEach { num ->
        if (arr.contains(num)) return true
        else arr.add(num)
    }
    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1,2,3,1)))
    println(containsDuplicate(intArrayOf(1, 2, 3, 4)))
    println(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
}