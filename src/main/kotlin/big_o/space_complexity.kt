package big_o

fun booooo(input: Array<Int>) {
    for (i in input.indices) {
        println("boooooooo!")
    }
} // O(1)

fun arrayOfHiNTimes(n: Int): Array<String?> {
    val hiArray = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        hiArray[i] = "Hi"
    }
    return hiArray
} // O(n)

fun main() {
    booooo(arrayOf(1, 2, 3, 4, 5))
    arrayOfHiNTimes(6).forEach { print("$it, ") }
}