package com.github.biancacristina.server.controller.impl

import com.github.biancacristina.server.api.BlockingApi
import com.github.biancacristina.server.api.NonBlockingApi
import com.github.biancacristina.server.log.logger
import com.github.biancacristina.server.controller.ThreadSampleController
import com.github.biancacristina.server.data.Response
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import java.util.*

@Controller("/server")
open class ThreadSampleControllerImpl(private val blockingApi: BlockingApi,
                                 private val nonBlockingApi: NonBlockingApi): ThreadSampleController {
    private val log = logger<ThreadSampleControllerImpl>()

    @Get("/blocking")
    override fun blocking(): Response {
        val uuid = UUID.randomUUID().toString()
        log.debug("Blocking by making two blocking api calls, $uuid")
        blockingApi.blocking(uuid)
        blockingApi.blocking(uuid)
        Thread.sleep(5000)
        log.debug("Returned after the block, $uuid")
        return Response(message = "Why did you block me?")
    }

    @Get("/non-blocking")
    override suspend fun nonBlocking(): Response {
        return coroutineScope {
            val uuid = UUID.randomUUID().toString()
            log.debug("Suspend fun $uuid using two non-blocking api calls")
            nonBlockingApi.nonBlocking(uuid)
            nonBlockingApi.nonBlocking(uuid)
            delay(5000)
            log.debug("Returned after suspend fun $uuid")
            Response("See? We can be friends, just don't block me")
        }
    }
}