package chatapp

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class ChatApplication{
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ChatApplication::class.java, *args)
        }
    }
}