package com.projecteugene.coding

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FindCheapestTicketTest {
    @Test
    fun findCheapestTicketTest_0() {
        assertEquals(TicketQ.findCheapTicketsFor(intArrayOf(1,3,4,5,11,12,23,24,30)), 17)
    }
    @Test
    fun findCheapestTicketTest_1() {
        assertEquals(TicketQ.findCheapTicketsFor(intArrayOf(1,4,6,7,28,30)), 11)
    }
    @Test
    fun findCheapestTicketTest_2() {
        assertEquals(TicketQ.findCheapTicketsFor(intArrayOf(1,7,8,9,10)), 9)
    }
    @Test
    fun findCheapestTicketTest_3() {
        assertEquals(TicketQ.findCheapTicketsFor(intArrayOf(1,7,8,9,10,15)), 11)
    }
}
