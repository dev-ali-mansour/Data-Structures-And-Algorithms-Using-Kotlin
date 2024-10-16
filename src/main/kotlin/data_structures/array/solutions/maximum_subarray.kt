package data_structures.array.solutions

fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    var currentSum = nums[0]

    for (i in 1..nums.lastIndex) {
        currentSum = maxOf(nums[i], currentSum + nums[i])

        maxSum = maxOf(maxSum, currentSum)
    }
    return maxSum
}

fun main() {
    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(maxSubArray(intArrayOf(1)))
    println(maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
}