package org.mvnsearch

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * help controller
 *
 * @author linux_china
 */
@RestController
@RequestMapping("/groovy")
class HelpController {

  @GetMapping("/user")
  Person help() {
    Person person = new Person()
    person.setId(1)
    person.setNick("Jacky")
    return person
  }
}
