package org.mvnsearch

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
class PortController {

    @RequestMapping("/")
    fun index() = "index"

}

/**
 * order controller
 *
 * @author linux_china
 */
@RestController
class OrderController {
    @RequestMapping("/order/pay")
    fun pay(): String {
        val order1 = PurchaseOrder(1L, 22.0)
        val order2 = PurchaseOrder(1L, 33.0)
        val total = order1 + order2
        return "cashier"
    }
}
