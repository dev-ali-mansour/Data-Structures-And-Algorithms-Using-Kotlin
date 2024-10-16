package data_structures.array

fun mergeSortedArrays(array1: IntArray, array2: IntArray): IntArray {
    // Check inputs
    if (array1.isEmpty()) return array2
    if (array2.isEmpty()) return array1

    val mergedArray = IntArray(array1.size + array2.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < array1.size && j < array2.size) {
        if (array1[i] < array2[j]) {
            mergedArray[k] = array1[i]
            i++
        } else {
            mergedArray[k] = array2[j]
            j++
        }
        k++
    }
    while (i < array1.size) {
        mergedArray[k] = array1[i]
        i++
        k++
    }
    while (j < array2.size) {
        mergedArray[k] = array2[j]
        j++
        k++
    }
    return mergedArray
}

fun main() {
    val mergedArray = mergeSortedArrays(intArrayOf(0, 3, 4, 31), intArrayOf(4, 6, 30))
    print(mergedArray.contentToString())
}