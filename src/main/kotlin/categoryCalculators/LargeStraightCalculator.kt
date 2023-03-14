package categoryCalculators
import Roll

class LargeStraightCalculator : CategoryScoreCalculator {
    override fun calculate(roll: Roll): Int {
        if (isLargeStraight(roll)) return 20
        return 0
    }

    private fun isLargeStraight(roll: Roll): Boolean {
        return (roll.contains(2) && roll.contains(3) && roll.contains(4) && roll.contains(5) && roll.contains(6))
    }
}
