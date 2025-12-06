import io.github.stscoundrel.solvePart1
import io.github.stscoundrel.solvePart2
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Part1Test {
    val testInput = """987654321111111
811111111111119
234234234234278
818181911112111""".trimIndent()

    @Test
    fun solvesPart1() {
        assertEquals(solvePart1(testInput), 357)
    }

    @Test
    fun solvesPart2() {
        assertEquals(solvePart2(testInput), 3121910778619)
    }
}