package org.mvnsearch

import org.springframework.stereotype.Component

/**
 * person
 *
 * @author linux_china
 */

class Person {
    var id: Int? = null
    var nick: String? = null
}

interface PersonRepository {
    @Deprecated("Please use findOne", ReplaceWith("findOne(id)"))
    fun findById(id: Int): Person

    fun findOne(id: Int): Person

    fun findNick(id: Int): String
}

@Component
open class PersonRepositoryImpl : PersonRepository {

    override fun findById(id: Int): Person {
        TODO("not implemented")
    }

    override fun findOne(id: Int): Person {
        return Person().apply {
            this.id = id
            this.nick = "nick:" + id
        }
    }

    override fun findNick(id: Int): String {
        TODO("not implemented")
    }
}
