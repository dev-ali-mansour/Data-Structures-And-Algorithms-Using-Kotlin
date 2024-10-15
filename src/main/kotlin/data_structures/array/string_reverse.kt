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

fun reverse2(string: String): String {
    var reversed = ""
    for (i in string.length - 1 downTo 0) {
        reversed += string[i]
    }
    return reversed
}

fun reverse3(string: String): String =
    string.split("").reversed().joinToString("")

fun reverse4(string: String): String {
    return string.reversed()
}

fun reverse5(string: String): String = string.reversed()

fun main() {
    val name = "Hi My name is Ali Mansour"
    println(reverse2(name))
    println(reverse(name))
    println(reverse3(name))
    println(reverse4(name))
    println(reverse5(name))
}