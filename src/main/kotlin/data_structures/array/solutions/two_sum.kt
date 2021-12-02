package data_structures.array.solutions

import java.lang.IllegalArgumentException

/* Problem:
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, item ->
        val found = map[target - item]
        found?.let { return intArrayOf(it, index) }
        map[item] = index
    }
    throw IllegalArgumentException("No Solution!")
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 26).joinToString(", "))
    println(twoSum(intArrayOf(3, 2, 4), 6).joinToString(", "))
}