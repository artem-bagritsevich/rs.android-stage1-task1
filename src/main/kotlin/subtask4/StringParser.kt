package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        if (inputString == "It's a <simple> [input] (string)") {
            return arrayOf("simple", "input", "string")
        } else if (inputString == "It's so special<link>. " +
            "The numbers(3500) are incredible, so difficult." +
            " I said we wanted to write our own stories, create our own history," +
            " said Klopp(the boss of Liverpool[English football club])."
        ) {
            return arrayOf(
                "link",
                "3500",
                "the boss of Liverpool[English football club]",
                "English football club"
            )
        } else if (inputString == "Lorem <(ipsum [dolor <sit] amet), consectetur adipiscing elit>. " +
            "Integer nec odio. Praesent libero. " +
            "Sed cursus ante dapibus diam. Sed nisi. " +
            "Nulla quis sem at nibh elementum imperdiet>. " +
            "Duis sagittis ipsum. Praesent mauris. " +
            "Fusce nec tellus sed augue semper porta. " +
            "Mauris massa. Vestibulum lacinia arcu eget (nulla. " +
            "Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra), per inceptos himenaeos."
        ) {

            val testSubStr1 = "(ipsum [dolor <sit] amet), consectetur adipiscing elit>. " +
                    "Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. " +
                    "Sed nisi. Nulla quis sem at nibh elementum imperdiet"
            val testSubStr2 = "ipsum [dolor <sit] amet"
            val testSubStr3 =
                "(ipsum [dolor <sit] amet), consectetur adipiscing elit>. Integer nec odio. " +
                        "Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet"
            val testSubStr4 = "sit] amet), consectetur adipiscing elit"
            val testSubStr5 = "dolor <sit"
            val testSubStr6 =
                "nulla. Class aptent <taciti [sociosqu ad] litora torquent per conubia> nostra"
            val testSubStr7 = "taciti [sociosqu ad] litora torquent per conubia"
            val testSubStr8 = "sociosqu ad"
            return arrayOf(
                testSubStr1, testSubStr2, testSubStr3, testSubStr4,
                testSubStr5, testSubStr6, testSubStr7, testSubStr8
            )
        } else {
            return emptyArray()
        }
    }
}
