package com.github.biancacristina.server.controller

import com.github.biancacristina.server.data.UserRequest

interface UserController {
    fun createUser(request: UserRequest)
}