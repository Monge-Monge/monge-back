package com.monge_monge.daily_weight.application

data class DailyWeightRegisterCommand(
    val userId: Long,
    val dailyWeight: Double
)
