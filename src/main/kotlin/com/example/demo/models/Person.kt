package com.example.demo.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("PERSON")
data class Person (
    @Id val id: String,
    val firstName: String,
    val lastName: String,
    )