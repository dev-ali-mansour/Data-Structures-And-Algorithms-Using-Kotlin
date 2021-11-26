package big_o

val boxes = arrayOf('a', 'b', 'c', 'd', 'e')

fun logAllPAirsOfArray(array: Array<Char>) {
    array.forEach { i ->
        array.forEach { j ->
            println("$i, $j")
        }
    }
} // O(n * n) --> O(n^2) --> Quadratic Time

fun main() {
    logAllPAirsOfArray(boxes)
}