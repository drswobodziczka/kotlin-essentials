data class Apply(
    var a: String,
    var b: Int) {

    lateinit var c: String
}

fun main() {
    val apply = Apply("aaa", 14).apply {
        c = "ha!"
    }

    println("instance data: $apply")
    println("initialized with apply : ${apply.c}")
}