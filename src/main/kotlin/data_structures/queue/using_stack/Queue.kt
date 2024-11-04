package data_structures.queue.using_stack

import java.util.Stack

//https://leetcode.com/problems/implement-queue-using-stacks/description/

class MyQueue() {
    private val queueStack = Stack<Int>()
    private val revStack = Stack<Int>()

    fun push(x: Int) {
        if (queueStack.size == 0)
            queueStack.push(x)
        else {
            while (queueStack.size != 0) {
                revStack.push(queueStack.pop())
            }
            revStack.push(x)
            while (revStack.size != 0) {
                queueStack.push(revStack.pop())
            }
        }
    }

    fun pop(): Int = if (queueStack.size > 0) queueStack.pop() else -1

    fun peek(): Int = queueStack.peek()

    fun empty(): Boolean = queueStack.size == 0

}

fun main() {
    val myQueue2 = MyQueue()
    myQueue2.push(1)
    myQueue2.push(2)
    println(myQueue2.peek())
    println(myQueue2.pop())
    println(myQueue2.empty())

}