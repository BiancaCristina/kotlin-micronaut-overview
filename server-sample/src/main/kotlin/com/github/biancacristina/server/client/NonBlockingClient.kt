package com.github.biancacristina.server.client

import com.github.biancacristina.server.api.BlockingApi
import com.github.biancacristina.server.api.NonBlockingApi
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Recoverable

@Client("http://localhost:8081/non-blocking")
@Recoverable(api = BlockingApi::class)
interface NonBlockingClient: NonBlockingApi {
    @Get("/{uuid}")
    override suspend fun nonBlocking(@PathVariable uuid: String)
}