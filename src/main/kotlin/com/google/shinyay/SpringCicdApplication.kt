package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCicdApplication

fun main(args: Array<String>) {
	runApplication<SpringCicdApplication>(*args)
}
