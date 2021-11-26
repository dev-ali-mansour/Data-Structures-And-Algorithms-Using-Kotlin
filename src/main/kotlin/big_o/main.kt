package big_o

import java.util.*

val nemo = arrayOf("nemo")
val everyone = arrayOf("dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank")
val large = arrayOfNulls<String>(100000)

fun findNemo(array: Array<String?>) {
//    val t0 = Calendar.getInstance().timeInMillis
    for (item in array) {
        if (item === "nemo") {
            println("Found Nemo!")
        }
    }
//    val t1 = Calendar.getInstance().timeInMillis
//    println("Call to find Nemo took ${t1 - t0} milliseconds")
}

fun main() {
    large.fill("nemo")
    findNemo(large) // O(n) --> Linear Time
}