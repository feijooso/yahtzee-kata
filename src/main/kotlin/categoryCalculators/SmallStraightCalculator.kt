package categoryCalculators
import Roll

class SmallStraightCalculator : CategoryScoreCalculator {
    override fun calculate(roll: Roll) = if (isSmallStraight(roll)) 15 else 0

    private fun isSmallStraight(roll: Roll) = (1..5).all { roll.contains(it) }
}
