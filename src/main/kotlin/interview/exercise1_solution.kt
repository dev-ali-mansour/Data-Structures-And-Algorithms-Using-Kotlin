package interview

// Brute Force Solution --> O(a*b) Time Complexity, O(1) Space Complexity
fun containCommonItem(arr1: Array<Any?>?, arr2: Array<Any?>?): Boolean {
    if (arr1 == null || arr2 == null) return false
    arr1.forEach { first ->
        arr2.forEach { second ->
            if (first == second) return true
        }
    }
    return false
}

// O(a+b) Time Complexity, O(a) Space Complexity
fun containCommonItem2(arr1: Array<Any?>?, arr2: Array<Any?>?): Boolean {
    // Loop through the first array and create
    // HashMap where keys == items in the array
    // Can we assume always 2 parameters?
    if (arr1 == null || arr2 == null) return false
    val map = HashMap<Any?, Boolean>()
    arr1.forEach { item ->
        map[item]?.let { if (!it) map[item] = true } ?: run { map[item] = true }
    }
    // Loop through the second array and check
    // if item in the second array exists in
    // the created HashMap
    arr2.forEach { item ->
        map[item]?.let { return true }
    }
    return false
}

// More readable using Kotlin built-in functions
fun containCommonItem3(arr1: Array<Any?>?, arr2: Array<Any?>?): Boolean =
    arr1?.let { firstArr -> firstArr.any { arr2?.contains(it) ?: false } } ?: false

fun main() {

    val array: Array<Any?> = arrayOf('a', 'b', 'c', 'x')
    val array2: Array<Any?> = arrayOf('z', 'y', 'x')
    println(containCommonItem(array, array2))
    println(containCommonItem2(array, array2))
    println(containCommonItem3(array, array2))
    println(containCommonItem(null, null))
    println(containCommonItem2(null, null))
    println(containCommonItem3(null, null))
}