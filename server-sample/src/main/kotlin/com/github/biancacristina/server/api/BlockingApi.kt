package com.github.biancacristina.server.api

import io.micronaut.http.annotation.PathVariable

interface BlockingApi {
    fun blocking(@PathVariable uuid: String)
}