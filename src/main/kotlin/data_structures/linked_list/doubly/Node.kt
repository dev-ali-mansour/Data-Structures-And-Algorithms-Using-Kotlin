package data_structures.linked_list.doubly


data class Node<T>(
    val value: T,
    var next: Node<T>? = null,
    var previous: Node<T>? = null
)