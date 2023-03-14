import categoryCalculators.CategoryScoreCalculatorFactory

class ScoreCalculator {
    private val factory = CategoryScoreCalculatorFactory()

    fun calculate(roll: Roll, category: Categories): Int {
        val calculator = factory.createFor(category)
        return calculator.calculate(roll)
    }
}
