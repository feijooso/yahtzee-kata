package categoryCalculators

import Roll

class ChanceScoreCalculator: CategoryScoreCalculator {
    override fun calculate(roll: Roll) = roll.sum()
}
