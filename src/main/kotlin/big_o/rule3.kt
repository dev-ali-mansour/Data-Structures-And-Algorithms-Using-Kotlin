package big_o

// Rule 3: Different terms for inputs
fun compressBoxesTwice(boxes: Array<Any>, boxes2: Array<Any>) {
    boxes.forEach { println(it) }
    boxes2.forEach { println(it) }
} // O(a + b)

fun compressBoxesTwice2(boxes: Array<Any>, boxes2: Array<Any>) {
    boxes.forEach { i ->
        boxes2.forEach { j -> println("$i, $j") }
    }
} // O(a * b)