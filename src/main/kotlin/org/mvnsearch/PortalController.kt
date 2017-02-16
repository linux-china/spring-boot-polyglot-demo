package org.mvnsearch

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
class CustomerController {
    
    @RequestMapping("/")
    fun index(): String {
        return "good"
    }
}