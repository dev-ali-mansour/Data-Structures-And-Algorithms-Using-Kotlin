package data_structures.stack.using_linked_list

class Stack<T> {
    private var top: Node<T>? = null
    private var bottom: Node<T>? = null
    private var length: Int = 0

    fun peek(): T? {
        return top?.value
    }

    fun push(value: T) {
        val newNode = Node(value)
        if (length == 0) {
            top = newNode
            bottom = newNode
        } else {
            val holdingPointer = top
            top = newNode
            top?.next = holdingPointer
        }
        length++
    }

    fun pop(): T? {
        if (isEmpty()) return null
        val first = top
        top = top?.next
        if (top == bottom)
            bottom = null
        length--
        return first?.value
    }

    fun isEmpty(): Boolean = length == 0

    val lastElement: T?
        get() = if (length > 0) bottom?.value else null
}

fun main() {
    val myStack = Stack<String>()
    myStack.push("Google")
    myStack.push("Udemy")
    myStack.push("Discord")
    println("Top Element: ${myStack.peek()}")
    println("Last Element: ${myStack.lastElement}")
    println("====================================")
    println(myStack.pop())
    println(myStack.pop())
    println(myStack.pop())
    println(myStack.pop())
}