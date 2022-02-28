import kotlin.random.Random

fun main() {

    println(Random.nextInt())

    val mapped = when (Random.nextInt()) {
        1 -> "one"
        2 -> "two"
        else -> "not defined"
    }
    println(mapped)
}