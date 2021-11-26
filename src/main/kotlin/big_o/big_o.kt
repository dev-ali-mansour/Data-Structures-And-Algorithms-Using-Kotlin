package big_o

// O(n) --> Linear Time
fun logBoxes(boxes: Array<Any>) {
    for (box in boxes) {
        println(box)
    }
}

// O(1) --> Constant Time
fun logFirstBox(boxes: Array<Any>) {
    println(boxes[0])
}

// O(2) --> O(1) --> Constant Time
fun logFirstTwoBoxes(boxes: Array<Any>) {
    println(boxes[0]) // O(1)
    println(boxes[1]) // O(1)
}