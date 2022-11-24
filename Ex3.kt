// Exercise: Advent of Code 2021:

import java.io.File

data class Submarine(val instructions:List<String>){
    var position:Int = 0
    var depth:Int = 0

    // read the instructions from the file:
    fun forward(x:Int){
        position += x
    }
    fun up(x:Int){
        depth += x
    }
    fun down(x:Int){
        depth -= x
    }
    init {
        // here I know that each line in the file consists of two parts: the command and the value:
        for (order in instructions) run {
            val command = order.filter { it.isLetter() }
            val value = order.filter { it.isDigit() }.toInt()
            if (command == "forward") this.forward(value)
            if (command == "up") {
                this.up(value)
            }
            if (command == "down") {
                this.down(value)
            }
        }
    }

}


// write the extension function to calculate sums of a three measurement sliding window:
fun List<Int>.sumOfThree(startIndex:Int) = this.slice(startIndex..startIndex+2).sum()

fun main() {
    // Day 1:
    val numbers = File("input.txt").readLines().map { it.toInt() }
    // I used the lambda here to convert the numbers from String to Int.
    val results = mutableListOf<Int>()

    for (index in 0..numbers.size-3){
        results.add(numbers.sumOfThree(index))
    }
    println(results) // [607, 618, 618, 617, 647, 716, 769, 792]

    // now I need to find the number of sums where the current sum is greater than the previous one:
    var increase = 0
    for (i in 1..results.lastIndex){
        if (results[i] > results[i-1]){
            increase++
        }
    }
    println("the number of sums where the current sum is greater than the previous one: $increase") // 5

    // -----------------------------------------------------------------------------------------------------------------
    println("---------------------------------------------------------------------------------------------------------")

    // Day 2: check the data class above:

    val instructions = File("instructions.txt").readLines()
    val submarine1 = Submarine(instructions)
    println("The Horizontal position: ${submarine1.position}")  // 15
    // I wanted to represent the depth as positive value as described in the exercise sheet, so I used the abs value.
    println("The depth: ${Math.abs(submarine1.depth)}") // 10


}