package course2.unit2

import java.util.function.Consumer

/**
 * lambda语法糖
 */
fun lambda1() {
    val thread = Thread(Runnable { -> })

    //如果Lambda没有参数可以省略箭头符号
    val thread2 = Thread(Runnable { })
    // 同时可以省略声明
    val thread3 = Thread({ })

    //如果Lambda(即{ })是函数的最后一个参数，则可以移到小括号()外面去
    val thread4 = Thread() { }

    //如果函数只有一个参数且这个参数是Lambda，则可以省略小括号()
    val thread5 = Thread { }
}

/**
 * Lambda闭包声明,最多22个参数。编译成class后会被编译成如 Function1，Function2之类的匿名类
 */
val echo = { name: String ->
    println(name)
}

fun main(args: Array<String>) {
    echo.invoke("JT")
    echo("Hello")
}