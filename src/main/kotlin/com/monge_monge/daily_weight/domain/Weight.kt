package com.monge_monge.daily_weight.domain

@JvmInline
value class Weight(
    private val weight: Double
) {

    init {
        require(weight >= 0) {
            "Weight must be greater or equal 0"
        }
    }
}
