package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        var b_actual = 0
        bill.forEachIndexed() { index, item ->
            if (index != k) {
                sum += item
            }
        }
        b_actual = sum / 2
        val difference = b - b_actual
        return if (difference == 0) {
            "Bon AppeTIT"
        } else {
            difference.toString()
        }
    }
}
