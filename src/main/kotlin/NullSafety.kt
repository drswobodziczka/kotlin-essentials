
fun main() {

    // this will NOT compile as String in non-null type
    val x: String = null;
    println(x.length);

    // this will NOT compile as we attampt to use possible null value without null-safety
    val y: String? = null;
    println(y.length);

    // this will compile as we marked initialization with ? -- kind of optional
    // handling nulls with ? -- silently
    val a: String? = null;
    println(a?.length);

    // handling nulls with Elvis operator -- and exception
    val b: String = null ?: throw IllegalArgumentException("exc");
    println(b.length);
}