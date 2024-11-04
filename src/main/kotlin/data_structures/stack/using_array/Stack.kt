package data_structures.stack.using_array

class Stack<T> {
    private var array = mutableListOf<T>()

    fun peek() = array.last()

    fun push(value: T) {
        array.add(value)
    }

    fun pop(): T? = if (isEmpty()) null else array.removeLast()

    fun isEmpty() = array.isEmpty()

    val lastElement: T?
        get() = array.first()
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