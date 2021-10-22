package com.example.demo.controller

import com.example.demo.models.Message
import com.example.demo.services.v1.MessageServiceV1
import org.springframework.web.bind.annotation.*

@RestController
class MessageResource(val service: MessageServiceV1) {
    @GetMapping
    fun index(): List<Message> = service.getAllMessages()

    @GetMapping("/messages")
    @ResponseBody
    fun getMessageWithText(@RequestParam text: String) {
        return service.getMessageWithText(text)
    }

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}