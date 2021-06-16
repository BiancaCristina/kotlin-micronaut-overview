package com.github.biancacristina.server.controller.impl

import com.github.biancacristina.server.controller.UserController
import com.github.biancacristina.server.data.UserRequest
import com.github.biancacristina.server.log.MDCPattern
import com.github.biancacristina.server.service.UserService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import javax.validation.Valid

@Controller("/user")
open class UserControllerImpl(private val userService: UserService): UserController {
    @Post
    @MDCPattern
    override fun createUser(@Body @Valid request: UserRequest) {
        userService.createUser(username = request.username)
    }
}