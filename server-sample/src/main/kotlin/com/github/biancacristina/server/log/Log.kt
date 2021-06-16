package com.github.biancacristina.server.log

import io.micronaut.core.annotation.Introspected

@Introspected
data class Log(val type: String,
               val data: Any?)