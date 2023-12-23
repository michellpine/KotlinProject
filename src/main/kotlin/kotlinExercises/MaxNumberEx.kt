package kotlinExercises

fun main() {
    val max = getMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("The maximum is $max")

    val array = intArrayOf(10, 20, 25)
    val max2 = getMax(1, 2, 3, 4, *array, 5, 6, 7, 8, 9, 10)
    println("The maximum is $max2")
}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    return max
}
