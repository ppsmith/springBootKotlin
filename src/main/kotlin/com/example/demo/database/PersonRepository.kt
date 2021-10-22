package com.example.demo.database

import com.example.demo.models.Person
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface PersonRepository: CrudRepository<Person, String> {

    @Query("SELECT * FROM PERSON")
    fun getAllUsers(): List<Person>

    @Query("SELECT * FROM PERSON WHERE ID + :id")
    fun getUserWithId(@Param("id") id: String): Person?

}