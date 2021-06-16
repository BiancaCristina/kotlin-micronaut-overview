package com.github.biancacristina.server.service.impl

import com.github.biancacristina.server.log.logger
import com.github.biancacristina.server.log.Log
import com.github.biancacristina.server.data.User
import com.github.biancacristina.server.service.UserService
import io.micronaut.context.annotation.Requires
import javax.inject.Singleton

@Singleton
@Requires(notEnv=["prd"])
class UserMockServiceImpl: UserService {
    private val log = logger<UserMockServiceImpl>()

    override fun createUser(username: String) {
        log.debug("Attempt to create mock user(username={})", username)
        log.debug("Looking for user with same mock username(username={})", username)
        log.debug("Created mock user(username={})", username)
        log.info(Log(type = "CREATE_USER_MOCK", data = User(username = username)).toString())
    }
}