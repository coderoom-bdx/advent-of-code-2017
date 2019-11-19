object CaptchaSummer {
    fun sum(inputString: String): Int {
        return inputString.fold(0 to inputString.last(), { (acc, previous), current ->
            val sum = if (previous == current) {
                acc + current.toString().toInt()
            } else {
                acc
            }
            Pair(sum, current)
        }).first

    }

}
