class Roll(private val dices: List<Int>) {
    init {
        if (hasInvalidDice(dices) || dices.size != 5) throw InvalidRollError()
    }

    private fun hasInvalidDice(dices: List<Int>) = dices.any { it > 6 || it < 1 }

    fun sum() = dices.sum()

    fun sumEqualTo(dice: Int) = dices.filter { it == dice }.sum()

    fun allEqual() = dices.all { it == dices[0] }

    fun contains(dice: Int) = dices.contains(dice)

    fun diceCount(dice: Int) = dices.count {it == dice}
}
