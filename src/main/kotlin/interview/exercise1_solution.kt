package interview

// Brute Force Solution --> O(n^2)
fun containCommonItem(arr1: Array<Char>, arr2: Array<Char>): Boolean {
    arr1.forEach { first ->
        arr2.forEach { second ->
            if (first == second) return true
        }
    }
    return false
}

fun containCommonItem2(arr1: Array<Char>, arr2: Array<Char>): Boolean {
    /*val map = HashMap<Char, Boolean>()
    arr1.forEach { item ->
       if(!map[item]!!) map[item] = true
    }*/
    val temp = arr1.toMutableList()
   /* val temp = arrayListOf<Char>()
    arr1.forEach { temp.add(it) }*/
    arr2.forEach { if (temp.contains(it)) return true else temp.add(it) }
    return false
}

fun main() {
    val array = arrayOf('a', 'b', 'c', 'x')
    val array2 = arrayOf('z', 'y', 'x')
    println(containCommonItem2(array, array2))
}