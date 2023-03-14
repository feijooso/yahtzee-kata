import Categories.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ScoreCalculatorTest {
    @ParameterizedTest
    @CsvSource(
        "11111, 5",
        "12222, 1",
        "11222, 2",
        "11122, 3",
    )
    fun `category ones returns sum of ones`(dices: String, expectedScore: Int) {
        val actualScore = scoreCalculator.calculate(roll(dices), Ones)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "22222, 10",
        "21111, 2",
    )
    fun `category twos returns sum of twos`(dices: String, expectedScore: Int) {
        val actualScore = scoreCalculator.calculate(roll(dices), Twos)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "12111, 6",
        "11112, 6",
    )
    fun `category chance returns sum of all dices`(dices: String, expectedScore: Int) {
        val actualScore = scoreCalculator.calculate(roll(dices), Chance)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "11111, 50",
        "22222, 50",
        "33334, 0",
    )
    fun `category yahtzee returns 50 if all dices are equal and 0 if not`(dices: String, expectedScore: Int) {
        val actualScore = scoreCalculator.calculate(roll(dices), Yahtzee)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "12345, 15",
        "11111, 0",
        "13245, 15",
    )
    fun `category small straight returns 15 if straight beginning in 1 and 0 if not`(dices: String, expectedScore: Int) {
        val actualScore = scoreCalculator.calculate(roll(dices), SmallStraight)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "23456, 20",
        "12532, 0",
        "64352, 20",
    )
    fun `category large straight returns 20 if straight beginning in 2 and 0 if not`(dices: String, expectedScore: Int) {
        val actualScore = scoreCalculator.calculate(roll(dices), LargeStraight)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "11132, 3",
        "43332, 9",
        "56451, 0",
        "11111, 3",
    )
    fun `category three of a kind returns sum of those three values`(dices: String, expectedScore: Int){
        val actualScore = scoreCalculator.calculate(roll(dices), ThreeOfAKind)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "11345, 2",
        "13345, 6",
        "13245, 0",
    )
    fun `category pair returns sum of pair`(dices: String, expectedScore: Int){
        val actualScore = scoreCalculator.calculate(roll(dices), Pair)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    @ParameterizedTest
    @CsvSource(
        "11335, 6",
        "15335, 10",
    )
    fun `category pair returns sum of highest pair if two pairs`(dices: String, expectedScore: Int){
        val actualScore = scoreCalculator.calculate(roll(dices), Pair)

        assertThat(actualScore).isEqualTo(expectedScore)
    }

    private fun roll(dices: String) = Roll(dices.map { it.digitToInt() })

    private val scoreCalculator = ScoreCalculator()
}

