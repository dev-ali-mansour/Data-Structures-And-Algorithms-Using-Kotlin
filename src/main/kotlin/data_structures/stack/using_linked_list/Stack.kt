package data_structures.stack.using_linked_list

class Stack<T> {
    private var top: Node<T>? = null
    private var bottom: Node<T>? = null
    private var length: Int = 0

    override fun toString(): String {
        if (isEmpty()) return "[]"
        val builder = StringBuilder("[")
        var tempTop = top
        while (tempTop != null) {
            builder.append(tempTop.value)
            tempTop = tempTop.next
            tempTop?.let {
                builder.append(", ")
            } ?: run {
                builder.append("]")
            }
        }
        return builder.toString()
    }

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

    fun pop() {
        if (length > 0) {
            top = top?.next
            if (top == bottom)
                bottom = null
        }
        length--
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

    println(myStack)

    myStack.pop()
    myStack.pop()
    myStack.pop()
    println(myStack)
}