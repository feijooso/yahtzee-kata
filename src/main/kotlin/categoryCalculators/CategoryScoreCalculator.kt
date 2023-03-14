package categoryCalculators

import Roll

interface CategoryScoreCalculator {
    fun calculate(roll: Roll): Int
}