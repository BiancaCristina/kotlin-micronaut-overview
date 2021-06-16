package com.github.biancacristina.server.log

import io.micronaut.aop.InterceptorBean
import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import io.micronaut.core.order.Ordered
import java.lang.Exception
import javax.inject.Singleton
import org.slf4j.MDC
import java.util.*

@Singleton
@InterceptorBean(MDCPattern::class)
class MDCPatternInterceptor: MethodInterceptor<MDC, Any> {
    private val log = logger<MDCPatternInterceptor>()

    override fun intercept(context: MethodInvocationContext<MDC, Any>?): Any {
        return try {
            MDC.put("request-id", UUID.randomUUID().toString())
            context!!.proceed()
        } catch (e: Exception) {
            log.error("Failed to handle MDC pattern", e)
        } finally {
            MDC.clear()
        }
    }

    override fun getOrder(): Int {
        return Ordered.LOWEST_PRECEDENCE
    }
}