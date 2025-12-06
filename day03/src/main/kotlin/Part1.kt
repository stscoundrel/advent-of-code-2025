package io.github.stscoundrel

fun inputToList(input: String): List<List<Int>> {
    return input
        .lines()
        .filter { it.isNotBlank() }
        .map { line ->
            line.map { char -> char.digitToInt() }
        }
}

fun findJoltage(numbers: List<Int>): Int {
    val joltages = mutableListOf<Int>()

    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            val joltage = "${numbers[i]}${numbers[j]}".toInt()
            joltages.add(joltage)
        }
    }

    return joltages.max()
}

fun solvePart1(input: String): Int {
    val list = inputToList((input))

    return list.sumOf {
        findJoltage(it)
    }
}