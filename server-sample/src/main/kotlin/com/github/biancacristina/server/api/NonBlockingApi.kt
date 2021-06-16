package com.github.biancacristina.server.api

import io.micronaut.http.annotation.PathVariable

interface NonBlockingApi {
    suspend fun nonBlocking(@PathVariable uuid: String)
}