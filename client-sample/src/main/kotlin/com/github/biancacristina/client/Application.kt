package com.github.biancacristina.client

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.biancacristina.client")
		.start()
}

