package data_structures.array.solutions

/*fun rotate(nums: IntArray, k: Int) {
    var temp = 0
    for (i in 1..k) {
        temp = nums[nums.lastIndex]
        for (j in nums.lastIndex downTo 1) {
            nums[j] = nums[j - 1]
        }
        nums[0] = temp
    }
}*/

fun rotate(nums: IntArray, k: Int) {
    val n = nums.size
    val k = k % n
    val temp = IntArray(n)
    for (i in nums.indices) {
        val x = (i + k) % n
        temp[(i + k) % n] = nums[i]
    }
    for (i in nums.indices) {
        nums[i] = temp[i]
    }
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val array2 = intArrayOf(-1, -100, 3, 99)

    rotate(array1, 3)
    println(array1.contentToString())
    rotate(array2, 2)
    println(array2.contentToString())
}