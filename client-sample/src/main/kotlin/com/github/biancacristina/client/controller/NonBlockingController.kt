package com.github.biancacristina.client.controller

interface NonBlockingController {
    suspend fun nonBlocking(uuid: String)
}