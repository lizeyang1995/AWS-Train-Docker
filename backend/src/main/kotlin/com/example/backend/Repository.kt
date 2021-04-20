package com.example.backend

import org.springframework.data.repository.CrudRepository

interface Repository : CrudRepository<User, Long> {
    override fun findAll(): Iterable<User>
}