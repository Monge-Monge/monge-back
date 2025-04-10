package com.monge_monge.daily_weight.api

import com.monge_monge.daily_weight.application.DailyWeightRegisterCommand
import com.monge_monge.daily_weight.application.RegisterDailyWeightUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/api/v1")
class DailyWeightController(
    private val dailyWeightRegisterUseCase: RegisterDailyWeightUseCase
) {

    @PostMapping("/daily-weight")
    fun registerDailyWeight(@RequestBody request: DailyWeightRegisterRequest): ResponseEntity<Any> {
        dailyWeightRegisterUseCase.execute(DailyWeightRegisterCommand(userId = 0L, dailyWeight = request.dailyWeight))
        return ResponseEntity.created(
            UriComponentsBuilder.fromPath("/api/v1/daily-weight/")
                .build()
                .toUri()
        ).build()
    }
}
