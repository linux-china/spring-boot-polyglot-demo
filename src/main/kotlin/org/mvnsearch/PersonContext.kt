package org.mvnsearch

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.stereotype.Component

/**
 * person
 *
 * @author linux_china
 */
class Person {
    @JsonProperty("ID")
    var id: Int? = null
    var nick: String? = null
    var age: Int? = null
    var status: Int? = null
    var password: String? = null;
}

interface PersonRepository {
    @Deprecated("Please use findOne", ReplaceWith("findOne(id)"))
    fun findById(id: Int): Person

    fun findOne(id: Int): Person

    fun findNick(id: Int): String
}

@Component
open class PersonRepositoryImpl : PersonRepository {

    @Deprecated("Please use findOne", replaceWith = ReplaceWith("findOne(id)"))
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


//----- extensions ----- //
fun Person.save() {
    this.age;
}

fun Person.changePassword(newPassword: String) {

}

val Int.person: Person
    get() {
        return Person().apply { id = this@person }
    }
