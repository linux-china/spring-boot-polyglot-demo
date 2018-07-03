package org.mvnsearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Demo application
 *
 * @author linux_china
 */
@SpringBootApplication
class DemoApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<DemoApplication>(*args)
        }
    }
}
