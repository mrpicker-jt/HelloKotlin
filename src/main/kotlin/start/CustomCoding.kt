package start
//一些在 Kotlin 中广泛使用的语法习惯

val fruits = listOf("apple", "orange", "pear", "banana", "grape", "avocado")
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

fun main(args: Array<String>) {
//    val customer = Customer("jt", "17610885580")
//    customer.name = "jt2"
//    println(customer)

//    foo("C")
//    foo("C", 1, "B")

    nullEx()

}

//创建DTO
data class Customer(var name: String, var mobile: String)

//函数的默认参数
fun foo(c: String, a: Int = 0, b: String = "b") {
    println("a:$a,b:$b,c:$c")
}

//过滤list
fun filterEx() {
    var newFruits = fruits.filter { x -> x.startsWith("a") }
    println(newFruits)
    newFruits = fruits.filter { it.endsWith("e") }
    println(newFruits)
}

//判断元素存在集合中
//字符串内插
fun exist() {
    if ("apple" in fruits) {
        val idx = fruits.indexOf("apple")
        println("${fruits[idx]} is good")
    }
}

//类型判断
fun whenEx(obj: Any): String {
    return when (obj) {
        1 -> "One"
        !is String -> "not a String"
        "Hello" -> "kotlin"
        else -> "Unknown"
    }
}

//遍历map
fun travelMap() {
    for ((k, v) in map) {
        println("$k:$v")
    }
}

//使用区间
fun intervalEx() {
    for (i in 1..10) {//闭区间，包含10
        print(i)
    }
    println()
    for (i in 1 until 10) {//开区间，不包含10
        print(i)
    }
    println()
    for (i in 10 downTo 1) {
        print(i)
    }
    println()
    for (i in 10 downTo 1 step 2) {
        print(i)
    }
}

//延迟属性
fun lazyEx() {
    val x = "x"
    val p: String by lazy {
        println("init p")
        x + "p"
    }
    println("do some things")
    println("x:$x,p:$p")
}

//拓展函数
fun extendFunctionEx() {
    fun String.testHello() {
        println("Hello , my length is $length")
    }
    "Hello,kotlin".testHello()
}

//创建单例
object SingleMan {
    const val name = "kotlin"
}

fun testSingleton() {
    println(SingleMan.name)
    println(SingleMan)
}

//null判断简写
fun nullEx() {
    val curTime = System.currentTimeMillis()
    var str: String? = when (curTime % 2) {
        0L -> null
        else -> "hh"
    }
    //If not null 缩写
    println("//If not null 缩写")
    println(str?.length)

    //If not null and else 缩写
    println("//If not null and else 缩写")
    println(str?.length ?: "str is null")

    //if null 执行一个语句
    println("//if null 执行一个语句")
    println(str ?: "i will show when str is null")

    //在可能会空的集合中取第一元素
    println("//在可能会空的集合中取第一元素")
    val emails = if (curTime % 2 == 0L) {
        listOf()
    } else{
        listOf("kotlin@learn.com")
    }
    println(emails.firstOrNull() ?:"first is null")

    fun String.testHello() {
        println("Hello , my length is $length")
    }
    //if not null 执行代码
    println("//if not null 执行代码")
    str?.testHello()//代码会执行到此处, 假如str不为null

    //映射可空值（如果非空的话）
    println("//映射可空值（如果非空的话）")
    val newStr=str ?: "Ops,str is null"
    println(newStr)
}
//More
//https://www.kotlincn.net/docs/reference/idioms.html#if-not-null-%E7%BC%A9%E5%86%99
