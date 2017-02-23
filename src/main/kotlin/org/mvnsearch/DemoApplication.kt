package org.mvnsearch

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

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}