class HelloKotlin {
    val predefinedCats = arrayListOf<String>("a", "b", "c");

    fun duplicate (catsAmount: Int, whoOwnsCats: String): Unit {
        val duplicateBy = 2
        println("$whoOwnsCats ma kotow $catsAmount * 2")
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
    HelloKotlin().duplicate(10, "Ala");
}