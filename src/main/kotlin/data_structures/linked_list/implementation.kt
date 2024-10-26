package data_structures.linked_list

data class Node<T>(var value: T, var next: Node<T>? = null)

class MyLinkedList<T>(value: T) {
    private var head: Node<T>? = Node(value = value)
    private var tail: Node<T>? = head
    var length: Int = 1
        private set

    fun print() {
        print("LinkedList: [ ")
        var tempHead = head
        while (tempHead != null) {
            if (tempHead == head) print("Head: ")
            if (tempHead == tail) print("Tail: ")
            print("{ Value: ${tempHead.value}, Next: ${tempHead.next?.value} }")
            tempHead = tempHead.next
            tempHead?.let {
                print(" --> ")
            } ?: run {
                println(" --> null ]")
            }
        }
    }

    override fun toString(): String {
        val builder = StringBuilder("[")
        var tempHead = head
        while (tempHead != null) {
            builder.append(tempHead.value)
            tempHead = tempHead.next
            tempHead?.let {
                builder.append(", ")
            } ?: run {
                builder.append("]")
            }
        }
        return builder.toString()
    }

    fun append(value: T) {
        val newNode = Node(value = value)
        tail?.next = newNode
        tail = newNode
        length++
    }

    fun prepend(value: T) {
        val newNode = Node(value = value, next = head)
        head = newNode
        length++
    }

    fun traverseToIndex(index: Int): Node<T>? {
        if (index < 0 || index >= length)
            throw IndexOutOfBoundsException("Index Out Of Bounds For Length $length")
        var current = head
        for (i in 0 until index) {
            current = current?.next
        }
        return current
    }

    fun insert(index: Int, value: T) {
        if (index < 0 || index >= length)
            throw IndexOutOfBoundsException("Index Out Of Bounds For Length $length")
        when (index) {
            0 -> prepend(value)
            length -> append(value)
            else -> {
                val leader = traverseToIndex(index - 1)
                val holdingPointer = leader?.next
                val newNode = Node(value = value, next = holdingPointer)
                leader?.next = newNode
                length++
            }
        }
    }

}

fun main() {
    val myLinkedList = MyLinkedList(10)
    myLinkedList.append(5)
    myLinkedList.append(16)
    myLinkedList.prepend(1)
    myLinkedList.insert(2, 99)

    println(myLinkedList)
}