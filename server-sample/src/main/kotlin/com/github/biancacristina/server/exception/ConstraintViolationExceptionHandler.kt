package com.github.biancacristina.server.exception

import com.github.biancacristina.server.log.logger
import io.micronaut.context.annotation.Replaces
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import io.micronaut.validation.exceptions.ConstraintExceptionHandler
import org.slf4j.Logger
import javax.inject.Singleton
import javax.validation.ConstraintViolationException

@Produces
@Singleton
@Replaces(ConstraintExceptionHandler::class)
@Requires(classes = [ConstraintViolationException::class, ExceptionHandler::class])
class ConstraintViolationExceptionHandler: ExceptionHandler<ConstraintViolationException, HttpResponse<Any>> {
    private val log: Logger = logger<ConstraintViolationExceptionHandler>()

    override fun handle(request: HttpRequest<*>?, exception: ConstraintViolationException): HttpResponse<Any> {
        log.error("constraintViolationExceptionHandler", exception)
        val fieldsError = HashMap<String, String?>().toMutableMap()
        exception.constraintViolations.forEach { error ->
            fieldsError += mapOf(error.propertyPath.toString() to error.message)
        }
        val response = ErrorResponse(message = "Failed to validate values provided",
                                     fields = fieldsError.toMap())
        return HttpResponse.badRequest(response)
    }
}