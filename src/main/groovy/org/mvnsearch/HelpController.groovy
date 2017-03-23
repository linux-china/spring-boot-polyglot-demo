package org.mvnsearch

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * help controller
 *
 * @author linux_china
 */
@RestController
class HelpController {

  @GetMapping("/help")
  public String help() {
    return "help"
  }
}
