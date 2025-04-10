package com.monge_monge.daily_weight.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DailyWeightRepositoryTest {

    @Autowired
    lateinit var dailyWeightRepository: DailyWeightRepository

    @Test
    fun `save 시 id가 생성된다`() {

        val saved = dailyWeightRepository.save(DailyWeight(userId = 1L, dailyWeight = Weight(74.0)))

        assertThat(saved.id).isNotNull
    }
}
