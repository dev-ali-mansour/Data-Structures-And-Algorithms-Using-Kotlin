package data_structures.linked_list

data class Node<T>(var value: T, var next: Node<T>? = null)

class MyLinkedList<T>(val value: T) {
    private var head: Node<T>? = Node(value = value)
    private var tail: Node<T>? = head
    var length: Int = 1
        private set

    fun print() {
        println("LinkedList: [")
        var tempHead = this.head
        while (tempHead != null) {
            print("{ value: ${tempHead.value}, next: ${tempHead.next} }")
            tempHead = tempHead.next
            tempHead?.let {
                println(", ")
            } ?: run {
                println()
            }
        }
        println("]")
    }

    fun append(value: T) {
        val newNode = Node(value = value)
        tail?.next = newNode
        tail = newNode
        length++
    }
}

fun main() {
    val myLinkedList = MyLinkedList(10)
    myLinkedList.append(5)
    myLinkedList.append(16)

    myLinkedList.print()
}