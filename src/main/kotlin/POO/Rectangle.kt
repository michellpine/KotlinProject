package POO

import kotlin.random.Random

class Rectangle(
    val a: Double,
    val b: Double
): Shape("Rectangle") {

    constructor(a: Double): this(a, a)

    constructor(a: Int, b: Int): this(a.toDouble(), b.toDouble())

    companion object {
        fun randomRectangle(): Rectangle {
            val a = Random.nextDouble(1.0, 10.0)
            val b = Random.nextDouble(10.0, 20.0)
            return Rectangle(a, b)
        }
    }

    init {
        println("$name created with area ${area()} and perimeter ${perimeter()}")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b
}
