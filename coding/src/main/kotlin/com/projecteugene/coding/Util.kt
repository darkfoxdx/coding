package com.projecteugene.coding


fun main(args: Array<String>) {
    println("Hello world")
//    println("${FibonacciQ.countFibonacci())
    val arr = intArrayOf(1, 4, 45, 6, 10, -8)
//    println("${arr.contentToString()}, sum 16, ${PairsQ.findPairs(arr, 16)}")

    val list1 = listOf(4, 5, 7, 10)
    val list2 = listOf(1, 4, 5, 7, 8, 10)

    val newList =(list1 + list2).sorted().distinct()
    println(newList.joinToString())
    println(mergeArrays(list1, list2).joinToString())

    println(". is " + TreeNodeQ.findMorse("."))
    println("- is " + TreeNodeQ.findMorse("-"))
    println("-.- is " + TreeNodeQ.findMorse("-.-"))
    println("? is " + TreeNodeQ.findMorse("?"))
    println("?-? is " + TreeNodeQ.findMorse("?-?"))
}

fun mergeArrays(array1: List<Int>, array2: List<Int>): List<Int> {
    val newList: MutableList<Int> = ArrayList()
    var a = 0
    var b = 0
    while (a < array1.size && b < array2.size) {
        if (array1[a] < array2[b]) {
            newList.add(array1[a++])
        } else if (array1[a] > array2[b]) {
            newList.add(array2[b++])
        } else if (array1[a] == array2[b]) {
            newList.add(array1[a++])
            b++
        }

    }
    return newList
}


data class Node(val value: Int, var next: Node)
fun reverseNodes(head: Node, number: Int): Node {
    var currentHead: Node = head
    var current: Node = head
    for (i in 0 until number) {
        val temp = current
        currentHead = currentHead.next // Head will be 2
        currentHead.next = current  // Next will be 1
        current = temp
    }

    return currentHead
}