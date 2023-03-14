package course2.unit2

/**
 * 高阶函数，一个函数或闭包的参数中有函数或闭包类型，则这个函数是高阶函数
 * 通常会用inline修饰，这样编译处的class中就会直接把闭包中的代码写出，而不是生成一个临时的闭包变量来调用
 */
inline fun onlyIf(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) {
        block()
    }
}


fun main(args: Array<String>) {
    val runnable = Runnable {
        println("Runnable::run")
    }
    val function: () -> Unit
    function = runnable::run

    onlyIf(true, function)
}