package com.example.demo.services.v1

import com.example.demo.database.PersonRepository
import com.example.demo.models.Person
import org.springframework.stereotype.Service


@Service
class PersonService(val db: PersonRepository) {

    fun getAllUsers(): List<Person> {
        return db.getAllUsers()
    }

    fun getUserWithId(id: String): Person? {
        return db.getUserWithId(id)
    }

}