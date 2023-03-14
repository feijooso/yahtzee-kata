package categoryCalculators

import Categories

class CategoryScoreCalculatorFactory {
    fun createFor(category: Categories) = when (category) {
        Categories.Ones -> OnesScoreCalculator()
        Categories.Twos -> TwosScoreCalculator()
        Categories.Chance -> ChanceScoreCalculator()
        Categories.Yahtzee -> YahtzeeScoreCalculator()
        Categories.SmallStraight -> SmallStraightCalculator()
        Categories.LargeStraight -> LargeStraightCalculator()
        Categories.ThreeOfAKind -> ThreeOfAKindCalculator()
        Categories.Pair -> PairScoreCalculator()
    }
}