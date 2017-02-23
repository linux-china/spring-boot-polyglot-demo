package org.mvnsearch

import java.util.*

/**
 * purchase order
 *
 * @author linux_china
 */
class PurchaseOrder(var buyerId: Long, var total: Double) {
    /**
     * created timestamp
     */
    val createdAt = Date()
    
    operator fun plus(order2: PurchaseOrder): Double {
        return this.total + order2.total
    }
}