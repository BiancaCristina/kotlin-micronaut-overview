package com.github.biancacristina.server.exception

import com.fasterxml.jackson.annotation.JsonInclude
import io.micronaut.core.annotation.Introspected

@Introspected
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ErrorResponse (val message: String,
                          val fields: Map<String, String?>? = null)