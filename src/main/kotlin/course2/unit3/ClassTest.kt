package course2.unit3

import java.awt.Color

/**
 * 声明一个类，如果没有父类，那么它有个默认的父类的类型是Any
 * Kotlin的类默认是 public 和 final的
 */
open class Fruit


interface CanEat

/**
 * 声明一个类和它的父类,以及它实现的接口
 */
class Apple : Fruit(), CanEat


open class Animal()

interface Walkable {
    fun walk()
}

/**
 *Kotlin声明主构造函数，主构造函数是直接跟在类名的右边。
 */
class Cat(age: Int) : Animal(), Walkable {

    /**
     * 如果想在主构造函数中做一些初始化工作，可以在init代码块中执行逻辑
     * init代码块会优先于次级构造函数执行
     */
    init {
        println("Cat is $age years old")
    }


    /**
     * 声明次级构造函数时必须继承主构造函数或父类的构造函数
     */
    constructor(length: Int, age: Int) : this(0) {
        println("Cat length is $length,age is $age")
    }


    override fun walk() {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    val cat:Cat = Cat(12,3)
}