package com.example.Java._3.Controller;


import com.example.Java._3.Model.ChatInput;
import com.example.Java._3.Model.ChatOutput;
import com.example.Java._3.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    //@RequestMapping("/message") //   /app/message
//    @MessageMapping("/message") //   /app/message
//    @SendTo("/topics/livechat")
//    public Message receivePublicMessage(@Payload Message message){
//        return message;
//    }

//    //@MessageMapping("/private-message")
//    public Message receivePrivateMessage(@Payload Message message){
//        simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private",message); // /user/{Andre}/private
//        return message;
//    }
        @MessageMapping("/message") //   /app/message
        @SendTo("/topics/livechat")
        public ChatOutput msg(@Payload ChatInput message){
        return new ChatOutput(HtmlUtils.htmlEscape(message.user() + ": " + message.message()));
    }
}
