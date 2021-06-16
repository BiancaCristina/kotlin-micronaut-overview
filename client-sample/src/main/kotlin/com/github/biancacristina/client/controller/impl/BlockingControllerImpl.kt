package com.github.biancacristina.client.controller.impl

import com.github.biancacristina.client.commons.logger
import com.github.biancacristina.client.controller.BlockingController
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/blocking")
class BlockingControllerImpl: BlockingController {
    private val log = logger<BlockingControllerImpl>()

    @Get
    override fun blocking(@PathVariable uuid: String) {
        log.debug("Receive blocking $uuid")
    }
}