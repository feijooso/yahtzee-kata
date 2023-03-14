package categoryCalculators
import Roll

class PairScoreCalculator : CategoryScoreCalculator {
    override fun calculate(roll: Roll) = highestPairIn(roll)?.times(2) ?: 0

    private fun highestPairIn(roll: Roll) = pairsIn(roll).maxOrNull()

    private fun pairsIn(roll: Roll) = (1..6).filter { hasPair(roll, it) }

    private fun hasPair(roll: Roll, dice: Int) = roll.diceCount(dice) >= 2
}
