package data_structures.linked_list

data class Node(var value: Any, var next: Node? = null)

class MyLinkedList(val value: Any) {
    private var head: Node? = Node(value = value)
    private var tail: Node? = head
    var length: Int = 1
        private set

    fun print() {
        print("LinkedList: [")
        var tempHead = this.head
        while (tempHead != null) {
            print(tempHead.value)
            tempHead = tempHead.next
            tempHead?.let { print(", ") }
        }
        print("]")
    }

    fun append(value: Any) {
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