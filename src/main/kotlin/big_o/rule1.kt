package big_o

// Rule 1: Worst case
class Rule1 {
    val everyone = arrayOf("dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank")

    fun findNemo(array: Array<String?>) {
        for (item in array) {
            if (item === "nemo") {
                println("Found Nemo!")
                break
            }
        }
    }
}
