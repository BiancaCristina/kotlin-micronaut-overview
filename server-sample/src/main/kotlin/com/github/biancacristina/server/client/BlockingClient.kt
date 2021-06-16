package com.github.biancacristina.server.client

import com.github.biancacristina.server.api.BlockingApi
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Recoverable

@Client("http://localhost:8081/blocking")
@Recoverable(api = BlockingApi::class)
interface BlockingClient: BlockingApi {
    @Get("/{uuid}")
    override fun blocking(@PathVariable uuid: String)
}