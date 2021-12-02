package data_structures.hash_table


class MyHashTable(size: Int) {
    private val data = arrayOfNulls<ArrayList<KeyValue>?>(size)
    private var currentLength: Int = 0

    private fun hash(key: String): Int {
        var hash = 0
        for (i in key.indices) {
            hash = (hash + key.codePointAt(i)) % data.size
        }
        return hash
    }

    operator fun set(key: String, value: Int) {
        val address = hash(key)
        if (data[address] == null) {
            val arrayAtAddress = ArrayList<KeyValue>()
            data[address] = arrayAtAddress
            currentLength++
        }

        val pair = KeyValue(key, value)
        data[address]?.add(pair)
    }

    operator fun get(key: String): Int? {
        val address = hash(key)
        val bucket = data[address]
        if (!bucket.isNullOrEmpty()) {
            for (item in bucket) {
                if (item.key == key) {
                    return item.value
                }
            }
        }
        return null
    }

    fun keys(): Array<String?> {
        val bucket = data
        val keysArray = arrayOfNulls<String>(currentLength)
        var count = 0
        for (keyValue in bucket) {
            keyValue?.let {
                keysArray[count] = it[0].key
                count++
            }
        }
        return keysArray
    }
}

fun main() {
    val myHashTable = MyHashTable(50)
    myHashTable["grapes"] = 10000
    myHashTable["apples"] = 1500
    println("Value of key grapes: ${myHashTable["grapes"]}")
    println("Value of key apples: ${myHashTable["apples"]}")
    println("Value of key oranges: ${myHashTable["oranges"]}")
    println("List of keys: ${myHashTable.keys().contentToString()}")
}

data class KeyValue(val key: String, val value: Int)
