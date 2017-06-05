package chatapp.controller

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PageController {

    private val logger = LoggerFactory.getLogger(PageController::class.java)

    @GetMapping("/")
    fun getIndex(): String {
        logger.info("GET Request for path: '/'")
        return "index"
    }
}