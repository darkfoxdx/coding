package com.projecteugene.coding

/**
 * Created by Eugene Low
 *
 * In an integer array, find a pair of numbers which add up to a given number.
 */
object PairsQ {
    fun findPairs(arr: IntArray, findTotal: Int): String {
        val hashMap: HashMap<Int, Int> = HashMap()
        for(i in 0 until arr.size) {
            val subtract = findTotal - arr[i]
            hashMap[arr[i]] = subtract
            val findIndex: Int? = arr.find { i == subtract }
            println("${arr[i]}, ${hashMap[arr[i]]}, $findIndex, i")
            if (findIndex != null && findIndex != i) {
                return "${arr[i]}, ${hashMap[arr[i]]}"
            }
        }
        return "n/a"
    }
}