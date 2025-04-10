package com.monge_monge.acceptance

import com.monge_monge.config.AcceptanceTest
import io.restassured.RestAssured
import io.restassured.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType

@AcceptanceTest
class DailyWeightAcceptanceTest {

    @Test
    fun `DailyWeight를 입력`() {
        val 몸무게입력응답헤더 = 몸무게입력요청()

        assertThat(몸무게입력응답헤더["Location"].value).isNotNull
    }

    private fun 몸무게입력요청(): Headers = RestAssured
        .given().log().all()
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .body(
            mapOf(
                "weight" to 74.0,
            )
        )
        .`when`()
        .post("/api/v1/daily-weight")
        .then().log().all()
        .extract().headers()


}
