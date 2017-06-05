package chatapp.controller

import chat.dto.Message
import chat.dto.OutputMessage
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class ChatController {

    @MessageMapping("/chat/{topic}")
    @SendTo("/topic/messages")
    @Throws(Exception::class)
    fun send(@DestinationVariable("topic") topic: String, message: Message): OutputMessage {
        return OutputMessage(message.from, message.text, topic)
    }

    //data class Message(val from: String, val text: String) todo json mapping not working

    //data class OutputMessage(val from: String, val text: String, val topic: String, val time: Date)
}