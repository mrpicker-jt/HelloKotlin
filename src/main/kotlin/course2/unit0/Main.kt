package course2.unit0

class Main {

}

fun main(args: Array<String>) {
    nestedFunction()
}

/**
 * 默认参数
 */
fun showName(name: String = "JT"): String {
    print(name)
    return name
}

/**
 * 函数单条语句的简写
 */
fun echo(name: String) = println(name)

/**
 * 嵌套函数，一般仅在递归或不希望外部访问的情况下使用
 */
fun nestedFunction(){
    val str = "Hello!"
    fun say(count:Int=10){
        println(str)
        if (count>0){
            say(count-1)
        }
    }
    say()
}

