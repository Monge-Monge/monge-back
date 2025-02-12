package com.monge_monge.config

import com.monge_monge.MongeMongeApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestExecutionListeners

@Retention(AnnotationRetention.RUNTIME)
@ActiveProfiles("test")
@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = [MongeMongeApplication::class],
    properties = ["spring.profiles.active=test"]
)
@TestExecutionListeners(
    value = [AcceptanceTestExecutionListener::class],
    mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS
)
annotation class AcceptanceTest()
