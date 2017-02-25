package org.mvnsearch

import org.mvnsearch.domain.DemoAppContext
import org.mvnsearch.domain.model.User
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Demo application
 *
 * @author linux_china
 */

var running: Boolean = true

@SpringBootApplication
open class DemoApplication {

}

/**
 * find user by ID
 */
fun Int.user(): User? {
    return DemoAppContext.userRepository.findOne(this);
}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}