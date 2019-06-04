package com.projecteugene.coding

/**
 * Created by Eugene Low
 *
 * Given a morse code tree, create a function which will take in a string and generate an output of possible
 * morse code. The string can only contain '.', '-' and a wildcard '?'
 *
 * . = E | - = T | -.- = K | ... = S | .- = A | -- = M
 * ? = [E, T] | ?. = [I, N] | .? = [I, A] | ?-? = [R, W, G, O]
 */
object TreeNodeQ {
    data class TreeNode(val value: String, val left: TreeNode?, val right: TreeNode?)

    private val S = TreeNode("S", null, null) // ...
    private val U = TreeNode("U", null, null) // ..-
    private val R = TreeNode("R", null, null) // .-.
    private val W = TreeNode("W", null, null) // .--

    private val D = TreeNode("D", null, null) // -..
    private val K = TreeNode("K", null, null) // -.-
    private val G = TreeNode("G", null, null) // --.
    private val O = TreeNode("O", null, null) // ---

    private val I = TreeNode("I", S, U) // ..
    private val A = TreeNode("A", R, W) // .-
    private val N = TreeNode("N", D, K) // -.
    private val M = TreeNode("M", G, O) // --

    private val E = TreeNode("E", I, A) // .
    private val T = TreeNode("T", N, M) // -

    private val MORSE: TreeNode = TreeNode("head", E, T)

    fun findMorse(word: String?): List<String> {
        if (word == null) return ArrayList()
        val arrayNodes: ArrayList<ArrayList<TreeNode?>> = ArrayList()
        arrayNodes.add(arrayListOf(MORSE))
        for (i in 0 until word.length){
            val tempNodes: ArrayList<TreeNode?> = ArrayList()
            for (node in arrayNodes[i]){
                when(word[i]) {
                    '.' -> tempNodes.add(node?.left)
                    '-' -> tempNodes.add(node?.right)
                    '?' -> {
                        tempNodes.add(node?.right)
                        tempNodes.add(node?.left)
                    }
                }
            }
            arrayNodes.add(tempNodes)
        }
        return arrayNodes[word.length].mapNotNull { it?.value }.reversed()
    }
}