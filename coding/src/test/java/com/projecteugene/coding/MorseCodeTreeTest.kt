package com.projecteugene.coding

import org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder
import org.junit.Test

import org.junit.Assert.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * . = E | - = T | -.- = K | ... = S | .- = A | -- = M
 * ? = [E, T] | ?. = [I, N] | .? = [I, A] | ?-? = [R, W, G, O]
 */
class MorseCodeTreeTest {
    @Test
    fun morseCodeTree_E() {
        assertThat(TreeNodeQ.findMorse("."), containsInAnyOrder("E"))
    }
    @Test
    fun morseCodeTree_T() {
        assertThat(TreeNodeQ.findMorse("-"), containsInAnyOrder("T"))
    }
    @Test
    fun morseCodeTree_K() {
        assertThat(TreeNodeQ.findMorse("-.-"), containsInAnyOrder("K"))
    }
    @Test
    fun morseCodeTree_S() {
        assertThat(TreeNodeQ.findMorse("..."), containsInAnyOrder("S"))
    }
    @Test
    fun morseCodeTree_A() {
        assertThat(TreeNodeQ.findMorse(".-"), containsInAnyOrder("A"))
    }
    @Test
    fun morseCodeTree_M() {
        assertThat(TreeNodeQ.findMorse("--"), containsInAnyOrder("M"))
    }
    @Test
    fun morseCodeTree_ET() {
        assertThat(TreeNodeQ.findMorse("?"), containsInAnyOrder("E", "T"))
    }
    @Test
    fun morseCodeTree_IN() {
        assertThat(TreeNodeQ.findMorse("?."), containsInAnyOrder("I", "N"))
    }
    @Test
    fun morseCodeTree_IA() {
        assertThat(TreeNodeQ.findMorse(".?"), containsInAnyOrder("I", "A"))
    }
    @Test
    fun morseCodeTree_RWGO() {
        assertThat(TreeNodeQ.findMorse("?-?"), containsInAnyOrder("R", "W", "G", "O"))
    }
}
