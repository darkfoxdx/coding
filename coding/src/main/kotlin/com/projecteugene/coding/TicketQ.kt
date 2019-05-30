package com.projecteugene.coding

/**
 * Created by Eugene Low
 *
 * There're 3 kinds of bus ticket. 1: ticket 1 cost 2 and can be used for a day. 2: ticket 2 cost 7 and can
 * be used for a consecutive 7 days. 3: ticket 3 cost 25 can be used for a month. Assume month here means
 * 30 consecutive days.
 *
 * Now there's a array filled with elements. Each element value is a date for a person to travel.
 * This array has already been sorted in ascending order, like {1,3,4,5,11,12,23,24,30}.
 * Obviously the final day is 30th and first day is 1st.
 *
 * So for any given array from a person to travel, how can this person cost least ?
 */

object TicketQ {
    fun findCheapTicketsFor(arr: IntArray): Int {
        val minCostArr = IntArray(31)
        minCostArr[0] = 0
        for (day in 1..30) {
            if (!arr.contains(day)) {
                minCostArr[day] = minCostArr[day - 1]
                continue
            }
            var minCost: Int = minCostArr[day - 1] + 2
            minCost = Math.min(minCost, minCostArr[Math.max(0, day - 7)] + 7)
            minCost = Math.min(minCost, 25)
            minCostArr[day] = minCost
        }

        return minCostArr[30]
    }
}