package interview

fun main() {
    println(hasPairWithSum2(intArrayOf(6, 4, 3, 2, 1, 7), 5))
}

// Naive
fun hasPairWithSum(arr: IntArray, sum: Int): Boolean {
    arr.forEach { num1 ->
        arr.forEach { num2 ->
            if (num1 + num2 == sum) return true
        }
    }
    return false
}

// Better
fun hasPairWithSum2(arr: IntArray, sum: Int): Boolean {
    val set = hashSetOf<Int>()
    arr.forEach { num ->
        if (set.contains(num)) return true
        else set.add(sum - num)
    }
    return false
}