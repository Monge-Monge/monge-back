package com.monge_monge.daily_weight.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "daily_weight")
class DailyWeight(
    val userId: Long,

    @Column(name = "daily_weight")
    val dailyWeight: Weight,
    val registeredAt: LocalDate = LocalDate.now(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
}
