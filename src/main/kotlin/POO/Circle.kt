package POO

import kotlin.random.Random

class Circle(
    val radius: Double
): Shape("Circle") {
    // private val PI = 3.141592

    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init {
        isRadiuosNegative()
        println("$name created with area ${area()} and perimeter ${perimeter()}")
    }

    override fun area() = radius * radius * ImportantNumbers.PI

    override fun perimeter() = 2 * radius * ImportantNumbers.PI

    fun isRadiuosNegative() = if (radius < 0) throw NegativeArraySizeException() else radius
}
