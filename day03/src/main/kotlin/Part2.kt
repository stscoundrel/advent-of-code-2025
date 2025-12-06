package io.github.stscoundrel

fun findHugeJoltage(bankDigits: List<Int>): Long {
    val selectedDigits = mutableListOf<Int>()
    val totalDigitsToPick = 12
    val bankSize = bankDigits.size
    var searchStartIndex = 0

    repeat(totalDigitsToPick) { slotIndex ->
        val remainingSlots = totalDigitsToPick - slotIndex - 1
        val lastSearchIndex = bankSize - remainingSlots - 1

        var bestCandidateDigit = -1
        var bestCandidateIndex = searchStartIndex

        // Largest digit that still has enough digits after it
        for (currentIndex in searchStartIndex..lastSearchIndex) {
            val currentDigit = bankDigits[currentIndex]

            if (currentDigit > bestCandidateDigit) {
                bestCandidateDigit = currentDigit
                bestCandidateIndex = currentIndex

                // Largest possible digit.
                if (currentDigit == 9) break
            }
        }

        selectedDigits.add(bestCandidateDigit)
        searchStartIndex = bestCandidateIndex + 1
    }

    return selectedDigits.joinToString("").toLong()
}

fun solvePart2(input: String): Long {
    val list = inputToList((input))

    return list.sumOf {
        findHugeJoltage(it)
    }
}