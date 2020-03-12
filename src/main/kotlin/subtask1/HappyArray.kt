package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var result = sadArray
        repeat(sadArray.size) {
            result = result.filterIndexed { index, item ->
                val previousItem = if (index > 0) {
                    result[index - 1]
                } else {
                    return@filterIndexed true
                }
                val nextItem = if (index < result.size - 1) {
                    result[index + 1]
                } else {
                    return@filterIndexed true
                }

                previousItem + nextItem >= item
            }.toIntArray()
        }
        return result
        //throw NotImplementedError("Not implemented")
    }
}
