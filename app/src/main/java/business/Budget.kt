package business

/**
 * A simple data class for budget
 */
data class Budget(
        val liabilities : Map<String, Double?>?,
        val income : Map<String, Double?>?,
        val assets : Map<String, Double?>?
)