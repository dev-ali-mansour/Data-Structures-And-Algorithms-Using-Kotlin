package data_structures.array

fun reverse(string: String): String {
    if (string.length < 2) return string
    val totalItems = string.length - 1
    var backwards = arrayOf<Char>()
    for (i in totalItems.downTo(0)) {
        backwards += string[i]
    }

    return backwards.joinToString("")
}

fun main() {
    val name = "Hi My name is Ali Mansour"
    println(reverse(name))
}