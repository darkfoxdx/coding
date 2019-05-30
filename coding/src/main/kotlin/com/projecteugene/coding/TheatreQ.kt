package com.projecteugene.coding

/**
 * Created by Eugene Low
 *
 * Given N rows of seats in a movie theater, each row with seats labeled A to K some seats are reserved.
 * A 3 person family want seats next to each other (seats across aisle is not allowed), return all available options.
 *
 * ABCDE FGHIJK
 *
 * Reserved seat will be given like "1A 2B 40G".
 */

object TheatreQ {
    fun findAvailableSeats(n: Int, reserved: String) {
        val rowArr = "A B C D E F G H I J K".split(" ").toTypedArray()
        val reservedArr = reserved.split(" ").toTypedArray()
        val theatreArr: Array<Array<String>> = Array(n) { Array(rowArr.size) { "" } }
        val availableArr: MutableList<String> = ArrayList()
        val reservedSymbol = "X"
        val people = 3
        for (row in 0 until n) {
            for (col in 0 until rowArr.size) {
                var seat = "${row+1}${rowArr[col]}"
                if (reservedArr.contains(seat)) seat = reservedSymbol
                theatreArr[row][col] = seat

                if (col >= people - 1) {
                    var availableSeats = ""
                    for (i in (people - 1) downTo 0) {
                        availableSeats += "${theatreArr[row][col - i]} "
                    }
                    if (!availableSeats.contains(reservedSymbol) &&
                            !availableSeats.contains(Regex("\\d+E \\d+F"))) {
                        availableArr.add(availableSeats.trim())
                    }
                }
            }
        }

        println(availableArr.joinToString("\n"))
    }
}