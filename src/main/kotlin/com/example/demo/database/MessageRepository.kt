package com.example.demo.database

import com.example.demo.models.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface MessageRepository: CrudRepository<Message, String> {
    @Query("SELECT * FROM MESSAGES")
    fun getAllMessages(): List<Message>

    @Query("SELECT * FROM MESSAGES WHERE TEXT = :text")
    fun getMessageWithText(@Param("text") text: String)
}