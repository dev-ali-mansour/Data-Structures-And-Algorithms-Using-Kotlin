package data_structures.array

class MyArray {
    private var length = 0
    private var data = arrayOfNulls<Any>(5)

    fun get(index: Int): Any? {
        return data[index]
    }

    fun push(item: String): Int {
        data[length] = item
        length++
        return length
    }

    fun pop(): Any? {
        val lastItem = data[length - 1]
        data[length - 1] = null
        length--
        return lastItem
    }

    fun delete(index: Int): Any? {
        val item = data[index]
        shiftItems(index)
        return item
    }

    private fun shiftItems(index: Int) {
        for (i in index until length) {
            data[i] = data[i + 1]
        }
        data[length - 1] = null
        length--
    }

    override fun toString(): String {
        var result = "length: $length, data: {"
        for (i in 0 until length) {
            result += "$i: ${data[i]}"
            if (i < length - 1) result += ", "
        }
        result += "}"
        return result
    }
}

fun main() {
    val newArray = MyArray()
    newArray.push("Hi")
    newArray.push("You")
    newArray.push("!")
//    newArray.pop()
//    newArray.pop()
    newArray.delete(0)
    newArray.push("are")
    newArray.push("nice")
    newArray.delete(1)
    println(newArray)
}