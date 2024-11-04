package data_structures.queue.using_linked_list

class Queue<T> {
    var first: Node<T>? = null
    var last: Node<T>? = null
    var length = 0

    fun peek(): T? = first?.value

    fun enqueue(value: T) {
        val newNode = Node<T>(value = value)
        if (isEmpty())
            first = newNode
        else last?.next = newNode
        last = newNode
        length++
    }

    fun dequeue(): T? {
        if (isEmpty()) return null
        if (first == last) last = null
        val value = first?.value
        first = first?.next
        length--
        return value
    }


    fun isEmpty() = length == 0

    val lastElement: T?
        get() = last?.value

}

fun main() {
    val myQueue = Queue<String>()
    myQueue.enqueue("Joy")
    myQueue.enqueue("Matt")
    myQueue.enqueue("Pavel")
    myQueue.enqueue("samir")
    println("First Element: ${myQueue.peek()}")
    println("Last Element: ${myQueue.lastElement}")
    println("====================================")
    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())
}