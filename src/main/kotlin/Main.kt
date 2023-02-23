import java.awt.Rectangle

val PI = 3.14
var x = 1
val items = listOf("apple", "banana", "pear", "orange")

fun main(args: Array<String>) {
    println("Hello World!")
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(1000L))
//    println(describe(2))
//    println(describe("other"))

    classEx()
}

fun increment() {
    x += 1
}

fun parseInt(str: Any): Int? {
    if (str is String && str.length > 0) {
        return str.length
    }
    return null
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
    if (x != null && y != null) {
        // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun forItem() {
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whileItem() {
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "jt"
    is Long -> "Long"
    !is String -> "not a string"
    else -> "Unknown"
}


fun rangeEx() {
    val x = 9
    val y = 10
    if (y in 1..x + 1) {
        println("fits in range")
    }
    if (-1 !in 0..items.lastIndex) {
        println("-1 is out of range")
    }
    if (items.size !in items.indices) {
        println("list size is out of valid list indices range, too")
    }
    for (x in 1..5) {
        print(x)
    }
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

fun collectionEx() {
    for (item in items) {
        println(item)
    }
    when {
        "apple" in items -> println("apple is fine too")
        "orange" in items -> println("juicy")
    }
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}

fun classEx(){
    val rect = Rectangle(5,2)
    println(rect)
}