package id.kotlin.mercari

class MercariExercise {

  fun fizzBuzz(target: Int) {
    for (input in 1..target) {
      val output = when {
        input.mod(15) == 0 -> "FizzBuzz"
        input.mod(3) == 0 -> "Fizz"
        input.mod(5) == 0 -> "Buzz"
        else -> input.toString()
      }

      println(output)
    }
  }
}

fun main() {
  val target = readlnOrNull()?.trim()?.toInt() ?: throw Exception("Unknown input!")
  val exercise = MercariExercise()
  exercise.fizzBuzz(target)
}