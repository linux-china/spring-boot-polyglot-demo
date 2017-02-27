package org.mvnsearch

import org.junit.Test
import org.mvnsearch.domain.DemoAppContext
import org.mvnsearch.domain.model.User

/**
 * Kotlin basic test
 *
 * @author linux_china
 */

fun String.print() {
    println(this)
}

val Int.user: User?
    get() = DemoAppContext.userRepository.findOne(this)

class KotlinBasicTest {

    @Test
    fun testSum() {
        val a = 5
        val b = 6
        println(sum(a, b))
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    @Test
    fun testStringTemplate() {
        val name = "jacky"
        println("Hell $name")
        name.print()
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        }
        return 0
    }

    @Test
    fun testRange() {
        for (x in 1..3) {
            println(x)
        }
    }

    @Test
    fun testStream() {
        val names = listOf("abc", "113", "ABC", "Apple")
        names.filter { it.startsWith("A") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }

    }

}