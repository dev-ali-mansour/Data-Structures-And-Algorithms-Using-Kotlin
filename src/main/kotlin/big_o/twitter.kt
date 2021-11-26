package big_o

// Find 1st and nth
val array = arrayOf("hi", "my", "teddy")
val array2 = arrayOf(
    Tweet("hi", 2012),
    Tweet("my", 2019),
    Tweet("teddy", 2018)
)

fun getFirstAndLastTweet(input: Array<String>) {
    val first = input[0] // O(1)
    val second = input[input.lastIndex] // O(1)
    println("First: $first \nSecond : $second")
} // O(1)

fun getFirstAndLastTweet(input: Array<Tweet>) {
    var first = input[0]
    var last = input[input.lastIndex]
    input.forEach { i ->
        if (i.date < first.date) first = i
        else if (i.date > last.date) last = i
    }
    println("First: ${first.tweet},${first.date}")
    println("Last: ${last.tweet},${last.date}")
}

fun main() {
    getFirstAndLastTweet(array) // O(1)
    getFirstAndLastTweet(array2) // O(n^2)
}

data class Tweet(val tweet: String, val date: Int)