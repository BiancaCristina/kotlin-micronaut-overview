package com.github.biancacristina.server.service.impl

import com.github.biancacristina.server.log.logger
import com.github.biancacristina.server.log.Log
import com.github.biancacristina.server.data.User
import com.github.biancacristina.server.service.UserService
import io.micronaut.context.annotation.Requires
import javax.inject.Singleton

@Singleton
@Requires(env=["prd"])
class UserServiceImpl: UserService {
    private val log = logger<UserServiceImpl>()

    override fun createUser(username: String) {
        log.debug("Attempt to create user(username={})", username)
        log.debug("Looking for user with same username(username={})", username)
        log.debug("Created user(username={})", username)
        log.info(Log(type = "CREATE_USER", data = User(username = username)).toString())
    }
}