package categoryCalculators

import Roll

class OnesScoreCalculator: CategoryScoreCalculator {
    override fun calculate(roll: Roll) = roll.sumEqualTo(1)
}