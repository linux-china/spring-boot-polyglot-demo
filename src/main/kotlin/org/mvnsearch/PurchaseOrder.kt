package org.mvnsearch

/**
 * purchase order
 *
 * @author linux_china
 */
class PurchaseOrder(var buyerId: Long, var total: Double) {

    operator fun plus(order2: PurchaseOrder): Double {
       return this.total + order2.total
    }
}