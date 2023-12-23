package POO

import POO.Exceptions.DivisionByZeroException


fun main() {
    var myRect = Rectangle(2.0,  3.0)
    println(myRect)
    myRect = Rectangle(2, 3) // using a different constructor
    println(myRect)

    var myCircle = Circle.randomCircle() // without parenthesis because without that we can access to the object
    println(myCircle)

    // Anonymous Classes
    val a = 3.0
    val b = 4.0
    val height = 2.0
    var parallelogram = object : Shape("Parallelogram", a, b, height) {

        init {
            println("Parallelogram created with area ${area()} and perimeter ${perimeter()}")
        }
        override fun area(): Double = a * height

        override fun perimeter(): Double = 2 * a + 2 * b

        fun isRectangle(): Boolean = height == b
    }
    println("$parallelogram  ${parallelogram.isRectangle()}")



    // Execptions
    val division = try {
        divide(5.0, 0.0)
    } catch (e: DivisionByZeroException) {
        0.0
    }

    val division2 = try {
        divide(5.0, 0.0)
    } catch (e: DivisionByZeroException) {
        0.0
    } finally {
        "This is from the finally block"
    }

    val circle = Circle(-1.0)
    println("Is circle valid $circle")

}


fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw DivisionByZeroException()
    }
    return a / b
}
