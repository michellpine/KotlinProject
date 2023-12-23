package kotlinExercises

fun main() {
    println("Enter a number:")

    val number = readlnOrNull()?.toInt()
    val listFibo = mutableListOf(0, 1)
    if (number != null) {
        for (i in 0..number - 2) {
            listFibo.add(listFibo.elementAt(i) + listFibo.elementAt(i+1))
        }
    }
    println("Fibo numbers equals to = $listFibo")
}
