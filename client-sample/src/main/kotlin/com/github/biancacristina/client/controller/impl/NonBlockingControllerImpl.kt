package com.github.biancacristina.client.controller.impl

import com.github.biancacristina.client.commons.logger
import com.github.biancacristina.client.controller.NonBlockingController
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/non-blocking")
class NonBlockingControllerImpl: NonBlockingController {
    private val log = logger<NonBlockingControllerImpl>()

    @Get("/{uuid}")
    override suspend fun nonBlocking(@PathVariable uuid: String) {
        log.debug("Receive non-blocking $uuid")
    }
}