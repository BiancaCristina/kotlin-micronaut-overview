package com.github.biancacristina.server.log

import io.micronaut.aop.Around
import io.micronaut.context.annotation.Type

@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@Around
@Type(MDCPatternInterceptor::class)
annotation class MDCPattern()
