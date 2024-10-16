package data_structures.array.solutions

/* Problem:
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

// Naive
/*fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] + nums[j] == target && i != j) {
                if (!result.contains(i)) result.add(i)
                if (!result.contains(j)) result.add(j)
            }
        }
    }
    return result.toIntArray()
}*/

// Better
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, item ->
        val complement = target - item
        map[complement]?.let {
            return intArrayOf(it, index)
        }
        map[item] = index
    }
    return intArrayOf()
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(twoSum(intArrayOf(3, 2, 4), 6).contentToString())
    println(twoSum(intArrayOf(3, 3), 6).contentToString())
}