package chat.controller;

import chat.controller.dto.Message;
import chat.controller.dto.OutputMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat/{topic}")
    @SendTo("/topic/messages")
    public OutputMessage send(@DestinationVariable("topic") String topic,
                              Message message) throws Exception
    {
        return new OutputMessage(message.getFrom(), message.getText(), topic);
    }

}
