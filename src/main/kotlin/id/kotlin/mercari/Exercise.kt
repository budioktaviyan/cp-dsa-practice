package id.kotlin.mercari

class MercariExercise {

  fun fizzBuzz(n: Int) {
    for (i in 1..n) {
      when {
        i.mod(15) == 0 -> println("FizzBuzz")
        i.mod(3) == 0 -> println("Fizz")
        i.mod(5) == 0 -> println("Buzz")
        else -> println(i)
      }
    }
  }
}

fun main() {
  val target = readlnOrNull()?.trim()?.toInt() ?: throw Exception("Unknown input!")
  val exercise = MercariExercise()
  exercise.fizzBuzz(target)
}