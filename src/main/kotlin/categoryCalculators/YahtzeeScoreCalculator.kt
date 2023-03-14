package categoryCalculators

import Roll

class YahtzeeScoreCalculator : CategoryScoreCalculator {
    override fun calculate(roll: Roll): Int {
        if (roll.allEqual()) return 50
        return 0
    }
}
