fun main(args: Array<String>) {

}

class Cat(height: Int) : Animal() {

    constructor(height: Int, width: Int) : this(height) {
        
    }

    var age: Int = 1

    fun run() {

    }
}

open class Animal {
    var name: String = "Mio"
}