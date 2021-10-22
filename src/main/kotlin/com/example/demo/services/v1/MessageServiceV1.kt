package com.example.demo.services.v1

import com.example.demo.database.MessageRepository
import com.example.demo.models.Message
import org.springframework.stereotype.Service


@Service
class MessageServiceV1(val db: MessageRepository) {

    fun getAllMessages(): List<Message> {
        return db.getAllMessages()
    }

    fun getMessageWithText(text: String) {
        return db.getMessageWithText(text)
    }

    fun post(message: Message){
        db.save(message)
    }
}