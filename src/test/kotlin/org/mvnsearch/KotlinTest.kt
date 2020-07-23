package org.mvnsearch

import org.junit.jupiter.api.Test

/**
 * kotlin test
 *
 * @author linux_china
 */

class KotlinTest {

    @Test
    fun spike() {
        val user = GroovyUser()
        user.id = 1;
        user.name = "good";
        println(user.name)
        println(getNick(1))
    }

    fun getNick(id: Int): String {
        return "Jacky:" + id
    }
}