package categoryCalculators

import Roll

class TwosScoreCalculator: CategoryScoreCalculator {
    override fun calculate(roll: Roll) = roll.sumEqualTo(2)
}