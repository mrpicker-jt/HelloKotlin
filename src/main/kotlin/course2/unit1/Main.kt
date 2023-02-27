package course2.unit1

import java.io.File


class Main {
}

fun main(args: Array<String>) {
    Dog().printName(Dog())
}

/**
 * 拓展函数 目的是给一些无法直接修改的类(比如第三方SDK类)增加自己的方法
 * 例如这里给File类拓展了一个jtReadText的函数
 */
fun testFun(){
    val file = File("gradlew.bat")
    println(file.jtReadText())
}

/**
 * 拓展File类的变量
 */
fun testVal(){
    val file = File("gradlew.bat")
    println(file.jtVal)
}


/**
 * 拓展函数的静态解析
 * Kotlin的拓展函数是添加成了static 的方法，不支持运行时多态，可以编译成class文件查看逻辑
 * Tools->Kotlin->Show Kotlin ByteCode
 */
open class Animal
class Dog: Animal()
fun Animal.name():String{
    return "Animal"
}
fun Dog.name():String{
    return "Dog"
}
fun Animal.printName(anim:Animal){
    println(anim.name())
}