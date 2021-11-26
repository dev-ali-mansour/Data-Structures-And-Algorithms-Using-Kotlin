package big_o

// Rule 2: Remove constants

fun printFirstItemThenFirstHalfThenSayHi100Times(items: Array<Any>) {
    println(items[0])
    val middleIndex = items.size / 2
    var index = 0

    while (index < middleIndex) {
        println(items[index])
        index++
    }

    for (i in 1..100) {
        println("hi")
    }
} // O(1 + n/2 + 100) --> O(n/2 + 101) --> O(n/2 + 1) --> O(n + 1) -- O(n)

fun compressBoxesTwice(boxes: Array<Any>) {
    boxes.forEach { println(it) }
    boxes.forEach { println(it) }
} // O(2n) --> O(n)