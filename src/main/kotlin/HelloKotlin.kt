class HelloKotlin {
    val predefinedCats = arrayListOf<String>("a", "b", "c");

    fun duplicate (catsAmount: Int, whoOwnsCats: String): Unit {
        val duplicateBy = 2
        println("$whoOwnsCats ma kotow $catsAmount * $duplicateBy")
    }

    fun checkIfCatsIn(cats: Array<String>): Boolean {
        var result = false;
        for (cat in cats) {
            result = result && cat in predefinedCats
        }
        return result;
    }
}

fun main() {
    HelloKotlin().duplicate(10, "Ala")
    val ifCatsIn = HelloKotlin().checkIfCatsIn(arrayOf("cat1", "cat2"))
    println("are cats in? $ifCatsIn");
}