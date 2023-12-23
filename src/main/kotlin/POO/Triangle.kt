package POO

import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
): Shape("Triangle") {

    init {
        println("$name created with area ${area()} and perimeter ${perimeter()}")
    }

    override fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 -a) * (perimeter() / 2 - b) * (perimeter() / 2 - c))

    override fun perimeter() = a + b + c
}
