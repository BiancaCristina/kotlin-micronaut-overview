package com.github.biancacristina.server.data

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
data class UserRequest (@field:NotBlank
                        val username: String)