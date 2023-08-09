package id.kotlin.talabat

class Solution(private val initialCoordinates: String = "0:0:N") {

  fun acceptCommand(command: String): String {
    val splitter = initialCoordinates.split(":")

    var x = splitter[0].toInt()
    var y = splitter[1].toInt()
    var direction = splitter[2]

    val coordinateR = mapOf(
      "N" to "E",
      "E" to "S",
      "S" to "W",
      "W" to "N"
    )

    val coordinateL = mapOf(
      "N" to "W",
      "W" to "S",
      "S" to "E",
      "E" to "N"
    )

    command.forEach { cmd ->
      when (cmd) {
        'R' -> direction = coordinateR[direction].toString()
        'L' -> direction = coordinateL[direction].toString()
        'M' -> when (direction) {
          "N" -> y = y.plus(1)
          "E" -> x = x.plus(1)
          "S" -> y = y.minus(1)
          "W" -> x = x.minus(1)
        }
      }
    }

    return "$x:$y:$direction"
  }
}