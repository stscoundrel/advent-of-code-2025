package io.github.stscoundrel

import java.io.File

fun main(args: Array<String>) {
    val file = File("input.txt")
    val input = file.readText()

    println("Part 1: " + solvePart1(input)) // 16842
    println("Part 2: " + solvePart2(input)) // 167523425665348
}