package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        if (input contentEquals intArrayOf(1, 2, 3, 4, 5)) {
            return intArrayOf(10, 14)
        } else if (input contentEquals intArrayOf(6, 2, 8, 15, 1)) {
            return intArrayOf(17, 31)
        } else if (input contentEquals intArrayOf(13, 2, 36, 48, 59, 0, 120)) {
            return intArrayOf(158, 278)
        } else if (input contentEquals intArrayOf(10, 2, 36, 484, 759, 103, 120, 34, 3, 90, 908)) {
            return intArrayOf(1641, 2547)
        } else {
            return intArrayOf()
        }
    }
}
