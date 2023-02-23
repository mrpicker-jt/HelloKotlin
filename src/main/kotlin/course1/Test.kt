package course1

import kotlin.reflect.KClass

var age: Int = 12;
var name: String = "JT";
var name2: String? = null

fun main(args: Array<String>) {
    val age = 18;
    val name = "jt"
    println("我叫%d,我今年%d岁");
}

fun myPrintLen(str: String): String {
    println("Name is $str")
    return str
}

/**
 * 单例写法
 */
object MySingle{
    @JvmStatic
    fun sayMessage(msg:String?){
        println("$msg")
    }
}

fun testClass(clazz:Class<JavaMain>){
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<KotlinMain>){
    println(clazz.simpleName)
}