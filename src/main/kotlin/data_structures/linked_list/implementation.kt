package data_structures.linked_list

data class Node<T>(var value: T, var next: Node<T>? = null)

class MyLinkedList<T>(val value: T) {
    private var head: Node<T>? = Node(value = value)
    private var tail: Node<T>? = head
    var length: Int = 1
        private set

    fun print() {
        print("LinkedList: [ ")
        var tempHead = head
        while (tempHead != null) {
            print("{ Value: ${tempHead.value}, Next: ${tempHead.next?.value} }")
            tempHead = tempHead.next
            tempHead?.let {
                print(" --> ")
            } ?: run {
                println(" --> null ]")
            }
        }
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