package data_structures.array.solutions

fun moveZeroes(nums: IntArray) {
    var nonZeroIndex = 0

    for (num in nums) {
        if (num != 0) nums[nonZeroIndex++] = num
    }

    for (i in nonZeroIndex..nums.lastIndex)
        nums[i] = 0
}

fun main() {
    var array = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(array)
    println(array.contentToString())
    array = intArrayOf(0)
    moveZeroes(array)
    println(array.contentToString())
    array = intArrayOf(0, 0, 0, 1)
    moveZeroes(array)
    println(array.contentToString())
}