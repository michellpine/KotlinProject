package kotlinExercises

fun main() {
    val sum = alternativeSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternative sum is $sum")
}

fun alternativeSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for (number in numbers) {
        if (toggle) {
            sum += number
        } else {
            sum -= number
        }
        toggle = !toggle
    }

    return sum
}
