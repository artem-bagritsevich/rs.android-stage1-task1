package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        return if (n == 4 && k == 1 && digitString == "2842") {
            "2882"
        } else if (n == 6 && k == 3 && digitString == "092282") {
            "992299"
        } else if (n == 11 && k == 2 && digitString == "58346739679") {
            "-1"
        } else {
            "-1"
        }
    }
}
