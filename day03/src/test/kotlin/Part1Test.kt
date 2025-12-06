import io.github.stscoundrel.solvePart1
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Part1Test {

    @Test
    fun solvesPart1() {
        val testInput = """987654321111111
811111111111119
234234234234278
818181911112111""".trimIndent()

        assertEquals(solvePart1(testInput), 357)
    }
}