package categoryCalculators
import Roll

class ThreeOfAKindCalculator : CategoryScoreCalculator {
    override fun calculate(roll: Roll): Int {
        for (value in 1..6) {
            if (hasThreeOf(roll, value)) return value*3
        }
        return 0
    }

    private fun hasThreeOf(roll: Roll, dice: Int) = roll.diceCount(dice) >= 3
}
