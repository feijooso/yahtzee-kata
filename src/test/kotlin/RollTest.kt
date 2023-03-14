import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class RollTest {
    @Test
    fun `fails if any dice is greater than 6`() {
        assertThrows<InvalidRollError> { Roll(listOf(7, 1, 1, 1, 1)) }
    }

    @Test
    fun `fails if any dice is less than 1`() {
        assertThrows<InvalidRollError> { Roll(listOf(1, 1, 1, 0, 1)) }
    }

    @Test
    fun `fails if more than five dices`() {
        assertThrows<InvalidRollError> { Roll(listOf(1, 2, 3, 4, 5, 6)) }
    }

    @Test
    fun `fails if less than five dices`() {
        assertThrows<InvalidRollError> { Roll(listOf(1, 2, 3, 4)) }
    }
}
