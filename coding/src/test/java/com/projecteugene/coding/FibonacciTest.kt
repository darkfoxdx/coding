package com.projecteugene.coding

import org.junit.Assert
import org.junit.Test

/**
 * Created by Eugene Low
 */
class FibonacciTest {
    @Test
    fun fibonacci_0() {
        Assert.assertEquals(FibonacciQ.countFibonacci(0), 0)
    }
    @Test
    fun fibonacci_1() {
        Assert.assertEquals(FibonacciQ.countFibonacci(1), 1)
    }
    @Test
    fun fibonacci_2() {
        Assert.assertEquals(FibonacciQ.countFibonacci(2), 1)
    }
    @Test
    fun fibonacci_3() {
        Assert.assertEquals(FibonacciQ.countFibonacci(3), 2)
    }
    @Test
    fun fibonacci_4() {
        Assert.assertEquals(FibonacciQ.countFibonacci(4), 3)
    }
    @Test
    fun fibonacci_5() {
        Assert.assertEquals(FibonacciQ.countFibonacci(5), 5)
    }
    @Test
    fun fibonacci_6() {
        Assert.assertEquals(FibonacciQ.countFibonacci(6), 8)
    }
    @Test
    fun fibonacci_32() {
        Assert.assertEquals(FibonacciQ.countFibonacci(32), 2178309)
    }
}
