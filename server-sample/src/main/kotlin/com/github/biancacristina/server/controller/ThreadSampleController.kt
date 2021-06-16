package com.github.biancacristina.server.controller

import com.github.biancacristina.server.data.Response

interface ThreadSampleController {
    fun blocking(): Response
    suspend fun nonBlocking(): Response
}