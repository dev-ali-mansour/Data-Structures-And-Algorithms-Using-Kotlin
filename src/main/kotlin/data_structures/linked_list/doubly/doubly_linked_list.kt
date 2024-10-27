package data_structures.linked_list.doubly

class MyDoublyLinkedList<T>(value: T) {
    var head: Node<T>? = Node(value = value)
    var tail: Node<T>? = head
    var length = 1
        private set

    override fun toString(): String {
        val builder = StringBuilder("LinkedList:[")
        var current = head
        while (current != null) {
            builder.append(current.value)
            current = current.next
            current?.let {
                builder.append(", ")
            } ?: run {
                builder.append("]")
            }
        }
        return builder.toString()
    }

    fun prepend(value: T) {
        val newNode = Node(value = value, next = head)
        head?.previous = newNode
        head = newNode
        length++
    }

    fun append(value: T) {
        val newNode = Node(value = value, previous = tail)
        tail?.next = newNode
        tail = newNode
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
        if (index < 0 || index > length)
            throw IndexOutOfBoundsException("Index Out Of Bounds For Length $length")
        when (index) {
            0 -> prepend(value)
            length -> append(value)
            else -> {
                val leader = traverseToIndex(index - 1)
                val newNode = Node(value = value, next = leader?.next, previous = leader)
                newNode.next?.previous = newNode
                leader?.next = newNode
            }
        }
        length++
    }

    fun remove(index: Int) {
        if (index < 0 || index > length)
            throw IndexOutOfBoundsException("Index Out Of Bounds For Length $length")
        when (index) {
            0 -> {
                head = head?.next
                head?.previous = null
            }

            length - 1 -> {
                tail = tail?.previous
                tail?.next = null
            }

            else -> {
                val removed = traverseToIndex(index)
                removed?.previous?.next = removed?.next
                removed?.next?.previous = removed?.previous
            }
        }
        length--
    }
}


fun main() {
    val myLinkedList = MyDoublyLinkedList(value = 10)
    myLinkedList.prepend(5)
    myLinkedList.append(2)
    myLinkedList.prepend(1)
    myLinkedList.append(16)
    println(myLinkedList)
    myLinkedList.insert(2, 17)
    println(myLinkedList)
    myLinkedList.remove(3)
    println(myLinkedList)

    println("length: " + myLinkedList.length)
    println("head value: " + myLinkedList.head?.value)
    println("head.previous: " + myLinkedList.head?.previous)
    println("head.next: " + myLinkedList.head?.next?.value)
    println("tail value: " + myLinkedList.tail?.value)
    println("tail previous: " + myLinkedList.tail?.previous?.value)
    println("tail.next: " + myLinkedList.tail?.next?.value)
}