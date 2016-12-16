package org.mvnsearch

import org.junit.Test

/**
 * kotlin test
 *
 * @author linux_china
 */

class KotlinTest {

    @Test
    fun spike() {
        println(getNick(1))
    }

    fun getNick(id: Int): String {
        return "Jacky:" + id
    }
}