package com.projecteugene.coding

/**
 * Created by Eugene Low
 */
object FibonacciQ {
    fun countFibonacci(number: Int): Int {
        return if (number < 2) {
            number
        } else {
            countFibonacci(number - 2) + countFibonacci(number - 1)
        }
    }
}