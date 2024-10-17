package data_structures.array.solutions

fun longestWord(sen: String): String {
    var maxLength = 0
    var string = ""
    sen.split(" ").forEach {
        val str = it.replace("&", "").replace("!", "").replace("?", "")
            .replace(".", "")
        if (str.length > maxLength) {
            maxLength = str.length
            string = str
        }
    }
    return string

}

fun main() {
    println(longestWord("Hello world123 567"))
    println(longestWord("fun&!! time"))
}